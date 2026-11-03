import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        boolean firstPrime = true;

        for (int number = 2; number <= n; number++) {
            boolean isPrime = true;
            for (int divisor = 2; divisor <= number / divisor; divisor++) {
                if (number % divisor == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                if (!firstPrime) {
                    System.out.print(" ");
                }
                System.out.print(number);
                firstPrime = false;
            }
        }
        System.out.println();
    }
}
