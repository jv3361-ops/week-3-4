import java.util.Scanner;

public class LargestOfThree {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int number1, number2, number3;
        boolean firstLargest, secondLargest, thirdLargest;

        System.out.print("Enter first number: ");
        number1 = input.nextInt();

        System.out.print("Enter second number: ");
        number2 = input.nextInt();

        System.out.print("Enter third number: ");
        number3 = input.nextInt();

        firstLargest = (number1 > number2) && (number1 > number3);
        secondLargest = (number2 > number1) && (number2 > number3);
        thirdLargest = (number3 > number1) && (number3 > number2);

        System.out.println("Is the first number the largest? " + firstLargest);
        System.out.println("Is the second number the largest? " + secondLargest);
        System.out.println("Is the third number the largest? " + thirdLargest);

        input.close();
    }
}