import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        //
        //fields and scanner
        Scanner scan = new Scanner(System.in);
        double num1, num2, answer;
        int operator;


        //Calculator setup and instructions
        System.out.println("Please enter first num: ");
        num1 = scan.nextDouble();
        System.out.println("Please enter second number");
        num2 = scan.nextDouble();
        System.out.println("Please enter the operator for the operation you would like to prefrom.\n" +
                "'0' for multiplication\n" +
                "'1' for division\n" +
                "'2' for addition\n" +
                "'3' for subtracxtion\n" +
                "'4' for modulo (remainder)");
        operator = scan.nextInt();

        //operation selection switch
        switch (operator){
            case 0:
                System.out.print("Your answer is " + (num1 * num2) + ".");
                break;
            case 1:
                System.out.print("Your answer is " + (num1 / num2) + ".");
                break;
            case 2:
                System.out.print("Your answer is " + (num1 + num2) + ".");
                break;
            case 3:
                System.out.print("Your answer is " + (num1 - num2) + ".");
                break;
            case 4:
                System.out.print("Your answer is " + (num1 % num2) + ".");
                break;
        }
    }
}
