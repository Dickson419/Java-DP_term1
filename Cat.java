package OOP;

public class Cat extends Animal{

    String colour;

    public Cat(int age, String name, String colour) {
        super(age, name); //super allows us to use the parent class implementation
        this.colour = colour; //this is unique to the cat class
    }

    @Override
    public void makeNoise() {
        super.makeNoise(); //calls the super class then...
        System.out.println("But I am the Cat class implementation...\nMeow Meow Meow!");
        //calls the cat class implementation
    }
}



