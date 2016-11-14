package myludoproject;

import javax.swing.JOptionPane;

//this class is for performing the chal of user
public class Chal {

    public static Chal chal = new Chal();
    int finalGreen = 76;//(76 to 79) labels is for final green pawn
    int push;

    /**
     *
     * @param index is the starting label/square of green pawn where user
     * clicked to move it forward
     */
    public void green(int index) {
        if (JFrameBoard.jFrameBoard.numbersArray[ JFrameBoard.jFrameBoard.stored] != 0
                && JFrameBoard.jFrameBoard.labelsFlag[index] == 1) {
            if (JFrameBoard.jFrameBoard.numbersArray[ JFrameBoard.jFrameBoard.stored] == 6 && index == 2 || index == 3 || index == 4 || index == 5) {
                JFrameBoard.jFrameBoard.labels[11].setIcon(JFrameBoard.jFrameBoard.labels[index].getIcon());
                JFrameBoard.jFrameBoard.labels[index].setIcon(null);
                for (int p = 0; p < 4; p++) {
                    if (JFrameBoard.jFrameBoard.greenPawnLabels[p] == index) {
                        push = p;
                    }
                }
                JFrameBoard.jFrameBoard.greenPawnLabels[push] = 11;
                JFrameBoard.jFrameBoard.labelsFlag[index] = 0;
                JFrameBoard.jFrameBoard.labelsFlag[11] = 1;
                JFrameBoard.jFrameBoard.numbersArray[ JFrameBoard.jFrameBoard.stored] = 0;
                JFrameBoard.jFrameBoard.stored++;
            } else if (index <= 62 && index >= 66) {  //paka ghor
                int sum = index + JFrameBoard.jFrameBoard.numbersArray[ JFrameBoard.jFrameBoard.stored];
                for (int p = 0; p < 4; p++) {
                    if (JFrameBoard.jFrameBoard.greenPawnLabels[p] == index) {
                        push = p;
                    }
                }
                if (sum <= 66) {
                    JFrameBoard.jFrameBoard.labels[sum].setIcon(JFrameBoard.jFrameBoard.labels[index].getIcon());
                    JFrameBoard.jFrameBoard.labels[index].setIcon(null);
                    JFrameBoard.jFrameBoard.greenPawnLabels[push] = sum;
                    JFrameBoard.jFrameBoard.labelsFlag[index] = 0;
                    JFrameBoard.jFrameBoard.labelsFlag[sum] = 1;
                } else if (sum == 67) {
                    JFrameBoard.jFrameBoard.labels[finalGreen++].setIcon(JFrameBoard.jFrameBoard.labels[index].getIcon());
                    JFrameBoard.jFrameBoard.labels[index].setIcon(null);
                    JFrameBoard.jFrameBoard.greenPawnLabels[push] = 0;
                    JFrameBoard.jFrameBoard.labelsFlag[index] = 0;
                    JFrameBoard.jFrameBoard.labelsFlag[sum] = 1;
                    if (finalGreen - 1 == 79) {
                        JOptionPane.showMessageDialog(null, " Congratulation! \n You Win !", "Message", JOptionPane.PLAIN_MESSAGE);
                        return;
                    }
                }
                JFrameBoard.jFrameBoard.numbersArray[JFrameBoard.jFrameBoard.stored] = 0;
                JFrameBoard.jFrameBoard.stored++;
            } else {
                int sum = index + JFrameBoard.jFrameBoard.numbersArray[JFrameBoard.jFrameBoard.stored];
                if (sum >= 67) {
                    JOptionPane.showMessageDialog(null, "ERROR!", "Message", JOptionPane.ERROR_MESSAGE);
                } else {
                    if (JFrameBoard.jFrameBoard.labelsFlag[sum] == 2 && (sum != 11 && sum != 24 && sum != 37 && sum != 50)) { //for kata
                        int blue;
                        if (JFrameBoard.jFrameBoard.labelsFlag[2] != 2) {
                            blue = 6;
                        } else if (JFrameBoard.jFrameBoard.labelsFlag[3] != 2) {
                            blue = 7;
                        } else if (JFrameBoard.jFrameBoard.labelsFlag[4] != 2) {
                            blue = 8;
                        } else {
                            blue = 9;
                        }
                        JFrameBoard.jFrameBoard.labels[blue].setIcon(JFrameBoard.jFrameBoard.labels[sum].getIcon());
                        JFrameBoard.jFrameBoard.labels[sum].setIcon(JFrameBoard.jFrameBoard.labels[index].getIcon());
                        JFrameBoard.jFrameBoard.labels[index].setIcon(null);
                        for (int p = 0; p < 4; p++) {
                            if (JFrameBoard.jFrameBoard.greenPawnLabels[p] == index) {
                                push = p;
                            }
                        }
                        JFrameBoard.jFrameBoard.greenPawnLabels[push] = sum;
                        for (int p = 0; p < 4; p++) {
                            if (Computer.computer.bluePawnLabels[p] == sum) {
                                push = p;
                            }
                        }
                        Computer.computer.bluePawnLabels[push] = blue;
                        JFrameBoard.jFrameBoard.labelsFlag[index] = 0;
                        JFrameBoard.jFrameBoard.labelsFlag[sum] = 1;
                        JFrameBoard.jFrameBoard.labelsFlag[blue] = 2;
                        JFrameBoard.jFrameBoard.numbersArray[JFrameBoard.jFrameBoard.stored] = 0;
                        JFrameBoard.jFrameBoard.stored++;
                        JFrameBoard.jFrameBoard.buttons[1].setEnabled(true);
                        JFrameBoard.jFrameBoard.buttons[2].setEnabled(false);
                        JFrameBoard.jFrameBoard.stored = 0;
                        JFrameBoard.jFrameBoard.count = 0;
                    } else {
                        if (index > 5) {
                            JFrameBoard.jFrameBoard.labels[sum].setIcon(JFrameBoard.jFrameBoard.labels[index].getIcon());
                            JFrameBoard.jFrameBoard.labels[index].setIcon(null);
                            for (int p = 0; p < 4; p++) {
                                if (JFrameBoard.jFrameBoard.greenPawnLabels[p] == index) {
                                    push = p;
                                }
                            }
                            JFrameBoard.jFrameBoard.greenPawnLabels[push] = sum;
                            JFrameBoard.jFrameBoard.labelsFlag[index] = 0;
                            JFrameBoard.jFrameBoard.labelsFlag[sum] = 1;
                            JFrameBoard.jFrameBoard.numbersArray[JFrameBoard.jFrameBoard.stored] = 0;
                            JFrameBoard.jFrameBoard.stored++;
                        }
                    }
                }
            }

        } else {
            JOptionPane.showMessageDialog(null, "ERROR!", "Message", JOptionPane.ERROR_MESSAGE);
        }

    }

}
