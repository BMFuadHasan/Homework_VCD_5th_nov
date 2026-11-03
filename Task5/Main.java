import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int height = input.nextInt();
        int width = input.nextInt();

        for (int row = 1; row <= height; row++) {
            for (int column = 1; column <= width; column++) {
                if (row == 1 || row == height || column == 1 || column == width) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
