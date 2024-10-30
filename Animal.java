package OOP;

public class Animal {
    int age;
    String name;

    public Animal(int age, String name){
        this.age = age;
        this.name = name;

    }

    public void makeNoise(){
        System.out.println("Hello I am the Animal Class speaking to you!");
    }

    public void eat(){
        System.out.println("Nom Nom Nom this is the sound Animals make!");
    }
}




