//Worked with Rasika on this 

import java.util.Scanner;

public class MyMain {
    
    public static int binaryToDecimal(String binary) { 
        int leng = binary.length();
        double high = Math.pow(2, (leng - 1));
        int high1 = (int) high;

        int c = 0;

        for (int i = 0; i < leng; i++){
            char a = binary.charAt(i);
            String var = String.valueOf(a);
            String one = "1";

            if (one.equals(var)){
                c = c + high1;
            }
            high1 = high1/2;
        }
        return c;
    }
    
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Type in a number in binary format: ");
        String command = scan.next();
        System.out.println("That is equal to the decimal value: " + binaryToDecimal(command));
    }
}
