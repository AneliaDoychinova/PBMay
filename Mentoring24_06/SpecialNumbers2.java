package Mentoring24_06;

import java.util.Scanner;

public class SpecialNumbers2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 1111; i <= 9999 ; i++) {
                int currentNum = i;
                int forthDigit = currentNum % 10;
                currentNum /= 10;

                int thirdDigit = currentNum % 10;
                currentNum /= 10;

                int secondDigit = currentNum % 10;
                int firstDigit = currentNum / 10;

                if (secondDigit == 0 || thirdDigit == 0 || forthDigit == 0){
                    continue;
                }
                if (n % firstDigit == 0 && n % secondDigit == 0 &&
                        n % thirdDigit == 0 && n % forthDigit == 0) {
                    System.out.print("" + firstDigit + secondDigit + thirdDigit +
                            forthDigit + " ");
                }
        }
    }
}
