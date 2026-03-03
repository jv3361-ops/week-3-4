import java.util.Scanner;

public class FirstSmallest {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int number1, number2, number3;
        boolean result;

        System.out.print("Enter first number: ");
        number1 = input.nextInt();

        System.out.print("Enter second number: ");
        number2 = input.nextInt();

        System.out.print("Enter third number: ");
        number3 = input.nextInt();

        result = (number1 < number2) && (number1 < number3);

        System.out.println(
            "Is the first number the smallest? " + result
        );

        input.close();
    }
}