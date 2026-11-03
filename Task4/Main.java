public class Main {
    public static void main(String[] args) {
        for (int number = 10; number <= 99; number++) {
            int tens = number / 10;
            int ones = number % 10;
            int reversed = ones * 10 + tens;

            if (tens * 2 == ones && reversed - number == 36) {
                System.out.println(number);
                return;
            }
        }
    }
}
