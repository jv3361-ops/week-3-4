import java.util.Scanner;

public class DivisibleByFive {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int number;
        boolean result;

        System.out.print("Enter a number: ");
        number = input.nextInt();

        result = (number % 5 == 0);

        System.out.println(
            "Is the number " + number + " divisible by 5? " + result
        );

        input.close();
    }
}