package prog2.ex3;
import java.util.Random;

public class Dice {
    private int value;
    private Random ra = new Random();

    Dice(){
        this.value = play();
    }

    int play(){
        return ra.nextInt(6) + 1;
    }

    int getValue(){
        return this.value;
    }

}
