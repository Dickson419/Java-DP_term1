package TopicFour;

import java.util.ArrayList;
import java.util.Random;

public class ArrayBasics {
    public static void main(String[] args) {
        ArrayList<Integer> myList = new ArrayList<>();

        Random num = new Random();

        for(int i = 0; i<10; i++){
            int number = num.nextInt(1,100);
            myList.add(number);
        }
        System.out.println(myList);
        displayArray(myList);

        System.out.println(minMax(myList)); //will only show a memory location

        int[] minMaxResult = minMax(myList);
        System.out.println("Min: " + minMaxResult[0] + ", Max: " + minMaxResult[1]);

    }

    public static void displayArray(ArrayList<Integer> list){
        for(int i=0; i<list.size();i++){
            System.out.println(list.get(i));
        }
    }

    public static int [] minMax(ArrayList<Integer> list){
        int min = list.get(0);  // Initialise min to the first element of the list
        int max = list.get(0);

        for (int i = 1; i < list.size(); i++) {  // Start from the second element
            if (list.get(i) < min) {
                min = list.get(i);  // Update min if a smaller value is found
            }
            if (list.get(i) > max) {
                max = list.get(i);  // Update min if a smaller value is found

            }
        }
        return new int[] {min, max};

    }
}

