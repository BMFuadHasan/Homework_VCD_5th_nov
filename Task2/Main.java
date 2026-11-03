import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int count = 0;

        System.out.println("Even numbers:");
        for (int i = 2; i <= n; i += 2) {
            if (count > 0) {
                System.out.print(" ");
            }
            System.out.print(i);
            count++;
        }
        System.out.println();
        System.out.println("Count: " + count);
    }
}
