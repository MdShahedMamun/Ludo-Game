package myludoproject;

import java.util.Arrays;
import javax.swing.JOptionPane;

public class Computer {
    boolean flag, paka, kacha, firstSixComputer, kataComputer;
    int sleep, blue, push, add;
    int finalBlue = 72;  //(72 to 75) labels is for final blue pawn
    int check = 5, cntSix2 = 0, indexSix2 = 0;
    int bluePawnLabels[] = new int[4];//containg four blue pawns labels 
    int numbersArrayComputer[] = new int[15];//containg numbers obtained by rolling dice for computer
    int six2[] = new int[3];
    public static Computer computer = new Computer();
    Runnable r;

    /**
     * initializing four green pawns labels(6 to 9)
     */
    Computer() {
        int j = 0;
        for (int i = 6; i <= 9; i++) {
            bluePawnLabels[j++] = i;
        }
    }

    /**
     * method for showing dice and obtained number for computer
     */
    public void showNumberComputer() {
        JFrameBoard.jFrameBoard.jLabel81.setVisible(true);  //jLabel81 is animated dice;
        flag = !flag;
        if (flag) {
            sleep = 900;
        } else {
            sleep = 700;
        }
        try {
            Thread.sleep(sleep);
        } catch (InterruptedException e) {
        }
        JFrameBoard.jFrameBoard.jLabel81.setVisible(false);
        int number = Dice.dice.moveDice();
        cntSix2++;
        six2[indexSix2++] = number;
        if (cntSix2 % 2 == 0) {
            indexSix2 = 0;
            if (six2[0] == six2[1] && six2[0] == 6) {
                number = 5;
            }
        }
        Arrays.sort(bluePawnLabels);
        if (JFrameBoard.jFrameBoard.addFlag) {
            add = 0;
            check = 5;
            JFrameBoard.jFrameBoard.addFlag = false;
        }
        int keep0, keep1, keep2;
        if (bluePawnLabels[0] >= 6 && bluePawnLabels[0] <= 9) {
            keep0 = 31;//karon add er moddhe 6 asei 6+5=11 
        } else {
            keep0 = bluePawnLabels[0];
        }
        if (bluePawnLabels[1] >= 6 && bluePawnLabels[1] <= 9) {
            keep1 = 31;
        } else {
            keep1 = bluePawnLabels[1];
        }
        if (bluePawnLabels[2] >= 6 && bluePawnLabels[2] <= 9) {
            keep2 = 31;
        } else {
            keep2 = bluePawnLabels[2];
        }
        if (number == 6) {
            if (JFrameBoard.jFrameBoard.labelsFlag[37] == 2) {
                number = 4;
            } else if (JFrameBoard.jFrameBoard.labelsFlag[37] == 1) {
                number = 5;
            }
        }
        while (JFrameBoard.jFrameBoard.labelsFlag[keep0 + number + add] == 2
                || JFrameBoard.jFrameBoard.labelsFlag[keep1 + number + add] == 2
                || JFrameBoard.jFrameBoard.labelsFlag[keep2 + number + add] == 2) {
            number = check--;
        }

        int sum = bluePawnLabels[3] + number;
        if (sum > 61 && blue >= 37 && blue <= 61) {
            sum = sum - 52;         //61 er porer ghor 10 tai 52 minus kore 9 
        } else if (sum > 35 && blue >= 10 && blue <= 35) {
            sum = sum + 31;          //35 er porer ghor 67 tai 31  add kore 66 
        }
        if (sum == 24 || sum == 50 || sum == 11) {
            if (number > 3) {
                number--;
            } else {
                number++;
            }
        }
        add += number;
        for (int i = 87; i <= 93; i++) {
            if (number != i) {
                JFrameBoard.jFrameBoard.labels[i].setVisible(false);
            }
        }
        JFrameBoard.jFrameBoard.labels[number + 87].setVisible(true);
        putInNumbersArrayComputer(number);
    }

    /**
     * containing computer logic for blue pawn
     */
    public void computerLogicFully() {
        showNumberComputer();
        while (JFrameBoard.jFrameBoard.count > 0 && numbersArrayComputer[JFrameBoard.jFrameBoard.count - 1] == 6
                && JFrameBoard.jFrameBoard.count != 3) {
            try {
                Thread.sleep(900);
            } catch (InterruptedException e) {

            }
            showNumberComputer();
        }
        for (int k = 0; k < JFrameBoard.jFrameBoard.count; k++) {
            kacha = false;
            paka = false;
            if (numbersArrayComputer[k] == 6) {
                for (int i = 0; i <= 3; i++) {
                    if (bluePawnLabels[i] >= 6 && bluePawnLabels[i] <= 9) {
                        kacha = true;
                        blue = bluePawnLabels[i];
                        push = i;
                        break;
                    }
                }
            }
            if (kacha) {
                try {
                    Thread.sleep(700);
                } catch (InterruptedException e) {

                }
                JFrameBoard.jFrameBoard.labels[37].setIcon(JFrameBoard.jFrameBoard.labels[blue].getIcon());
                JFrameBoard.jFrameBoard.labels[blue].setIcon(null);
                bluePawnLabels[push] = 37;
                JFrameBoard.jFrameBoard.labelsFlag[blue] = 0;
                JFrameBoard.jFrameBoard.labelsFlag[37] = 2;
                numbersArrayComputer[k] = 0;
                continue;
            }

            //sort according to move front pawn first   
            for (int i = 0; i <= 2; i++) {
                for (int j = i + 1; j <= 3; j++) {
                    if (bluePawnLabels[i] >= 10 && bluePawnLabels[i] <= 35 && bluePawnLabels[j] >= 37 && bluePawnLabels[j] <= 61) {
                        if (bluePawnLabels[i] > bluePawnLabels[j]) {
                            int temp = bluePawnLabels[i];
                            bluePawnLabels[i] = bluePawnLabels[j];
                            bluePawnLabels[j] = temp;
                        }
                    } else if (bluePawnLabels[i] >= 37 && bluePawnLabels[i] <= 61 && bluePawnLabels[j] >= 10 && bluePawnLabels[j] <= 35) {
                        if (bluePawnLabels[j] > bluePawnLabels[i]) {
                            int temp = bluePawnLabels[i];
                            bluePawnLabels[i] = bluePawnLabels[j];
                            bluePawnLabels[j] = temp;
                        }
                    } else {
                        if (bluePawnLabels[i] < bluePawnLabels[j]) {
                            int temp = bluePawnLabels[i];
                            bluePawnLabels[i] = bluePawnLabels[j];
                            bluePawnLabels[j] = temp;
                        }
                    }
                }
            }
            for (int i = 0; i <= 2; i++) {
                if (bluePawnLabels[i] == 37) {
                    int temp = bluePawnLabels[i];
                    bluePawnLabels[i] = bluePawnLabels[0];
                    bluePawnLabels[0] = temp;
                }
            }
            for (int i = 0; i <= 3; i++) {
                if (bluePawnLabels[i] != 0) {
                    blue = bluePawnLabels[i];
                    push = i;

                    int sum = blue + numbersArrayComputer[k];
                    if (sum > 61 && blue >= 37 && blue <= 61) {
                        sum = sum - 52;         //61 er porer ghor 10 tai 52 minus kore 9 
                    } else if (sum > 35 && blue >= 10 && blue <= 35) {
                        sum = sum + 31;          //35 er porer ghor 67 tai 31  add kore 66 
                    }
                    if (JFrameBoard.jFrameBoard.labelsFlag[sum] == 1 && (sum != 11 && sum != 24 && sum != 37 && sum != 50)) {
                        int green;
                        if (JFrameBoard.jFrameBoard.labelsFlag[2] != 1) {
                            green = 2;
                        } else if (JFrameBoard.jFrameBoard.labelsFlag[3] != 1) {
                            green = 3;
                        } else if (JFrameBoard.jFrameBoard.labelsFlag[4] != 1) {
                            green = 4;
                        } else {
                            green = 5;
                        }
                        try {
                            Thread.sleep(800);
                        } catch (InterruptedException e) {

                        }
                        JFrameBoard.jFrameBoard.labels[green].setIcon(JFrameBoard.jFrameBoard.labels[sum].getIcon());
                        try {
                            Thread.sleep(800);
                        } catch (InterruptedException e) {

                        }
                        JFrameBoard.jFrameBoard.labels[sum].setIcon(JFrameBoard.jFrameBoard.labels[blue].getIcon());
                        JFrameBoard.jFrameBoard.labels[blue].setIcon(null);
                        bluePawnLabels[push] = sum;
                        JFrameBoard.jFrameBoard.labelsFlag[blue] = 0;
                        JFrameBoard.jFrameBoard.labelsFlag[sum] = 2;
                        JFrameBoard.jFrameBoard.labelsFlag[green] = 1;
                        numbersArrayComputer[k] = 0;
                        for (int p = 0; p < 4; p++) {
                            if (JFrameBoard.jFrameBoard.greenPawnLabels[p] == sum) {
                                push = p;
                            }
                        }
                        JFrameBoard.jFrameBoard.greenPawnLabels[push] = green;
                        kataComputer = true;
                        computerLogic();
                        break;
                    } else {
                        if (sum >= 10 && sum <= 72) {
                            if (sum >= 67 && sum <= 72) {             //for paka 
                                if (sum <= 71) {
                                    try {
                                        Thread.sleep(700);
                                    } catch (InterruptedException e) {

                                    }
                                    JFrameBoard.jFrameBoard.labels[sum].setIcon(JFrameBoard.jFrameBoard.labels[blue].getIcon());
                                    JFrameBoard.jFrameBoard.labels[blue].setIcon(null);
                                    bluePawnLabels[push] = sum;
                                    JFrameBoard.jFrameBoard.labelsFlag[blue] = 0;
                                    JFrameBoard.jFrameBoard.labelsFlag[sum] = 2;
                                    numbersArrayComputer[k] = 0;
                                } else if (sum == 72) {
                                    try {
                                        Thread.sleep(700);
                                    } catch (InterruptedException e) {

                                    }
                                    JFrameBoard.jFrameBoard.labels[finalBlue++].setIcon(JFrameBoard.jFrameBoard.labels[blue].getIcon());
                                    JFrameBoard.jFrameBoard.labels[blue].setIcon(null);
                                    bluePawnLabels[push] = 0;
                                    JFrameBoard.jFrameBoard.labelsFlag[blue] = 0;
                                    JFrameBoard.jFrameBoard.labelsFlag[72] = 2;
                                    numbersArrayComputer[k] = 0;
                                    if (finalBlue - 1 == 75) {
                                        JOptionPane.showMessageDialog(null, "Computer Win !", "Message", JOptionPane.PLAIN_MESSAGE);
                                        return;
                                    }
                                }
                                break;
                            } else {

                                try {
                                    Thread.sleep(300);
                                } catch (InterruptedException e) {

                                }
                                if (blue > 9) {                //valid pawn
                                    JFrameBoard.jFrameBoard.labels[sum].setIcon(JFrameBoard.jFrameBoard.labels[blue].getIcon());
                                    JFrameBoard.jFrameBoard.labels[blue].setIcon(null);
                                    bluePawnLabels[push] = sum;
                                    JFrameBoard.jFrameBoard.labelsFlag[blue] = 0;
                                    JFrameBoard.jFrameBoard.labelsFlag[sum] = 2;
                                    numbersArrayComputer[k] = 0;
                                    break;
                                } else {
                                    continue;
                                }
                            }
                        } else {
                            continue;
                        }

                    }
                }
            }
        }
        JFrameBoard.jFrameBoard.count = 0;
        JFrameBoard.jFrameBoard.stored = 0;
        JFrameBoard.jFrameBoard.addFlag = true;
    }

    /**
     * call the main working method computerLogicFully
     */
    public void computerLogicsNewThread() {

        r = new Runnable() {
            public void run() {
                computerLogicFully();
            }
        };
    }

    /**
     *
     * @param number obtained by rolling dice for computer
     */
    public void putInNumbersArrayComputer(int number) {
        if (number == 6) {
            firstSixComputer = true;
        } else if (firstSixComputer == false) {
            JFrameBoard.jFrameBoard.buttons[2].setEnabled(false);
            JFrameBoard.jFrameBoard.buttons[1].setEnabled(true);
        }

        if (firstSixComputer) {
            numbersArrayComputer[JFrameBoard.jFrameBoard.count++] = number;
            for (int i = 0; i < JFrameBoard.jFrameBoard.count; i++) {
                if (numbersArrayComputer[i] < 6) {                              //&& JFrameBoard.jFrameBoard.kataComputer == false
                    JFrameBoard.jFrameBoard.buttons[2].setEnabled(false);
                    JFrameBoard.jFrameBoard.buttons[1].setEnabled(true);
                }
            }
        }
    }

    /**
     * calling computer logics thread
     */
    public void computerLogic() {
        computerLogicsNewThread();
        Thread t = new Thread(r);
        t.start();
    }

}
