package intro;

public class Binary {
    public static void main(String[] args) {
        decimalToBinaryConverter(14);
    }

    public static void decimalToBinaryConverter(int number)
    {
        //store the original number for output
        int originalNumber = number;

        //string to hold the result (binary)
        StringBuilder binaryNumber = new StringBuilder();

        //basecase/edge case for 0
        if (number == 0){
            binaryNumber.append("0");
        }
        else{
            //convert decimal to binary
            while (number > 0){
                //get remainder (either 0 or 1)
                int remainder = number % 2;
                //append the remainder to the binary number
                binaryNumber.insert(0, remainder);
                //divide the number by 2
                number = number / 2;
            }
        }
        //output the result
        System.out.println("Binary equivalent of " + originalNumber + " is " + binaryNumber.toString());

    }

}