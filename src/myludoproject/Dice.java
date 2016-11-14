package myludoproject;

import java.util.Random;

//this class is for generating random number ranging from 1 to 6
public class Dice {

    public static Dice dice = new Dice();
    Random random = new Random();
    int number;

    /**
     *
     * @return any number ranging from 1 to 6
     */
    public int moveDice() {
        number = 1 + random.nextInt(6);
        return number;
    }

}
