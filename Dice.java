import java.util.Random;

public class Dice {
    //Attributes
    private int sides; // number of sides for the dice

    //Constructor
    public Dice(int sides){
        if(sides < 2){
            throw new IllegalArgumentException("Dice must have at least two sides");
        }
        this.sides = sides;
    }

    //Methods

    public int roll(){
        Random random = new Random();
        int hello = 5;
        System.out.println(hello);
        return random.nextInt(sides)+1; //return a number between 1 and sides

    }

    public int getSides(){
        return sides;
    }

}
