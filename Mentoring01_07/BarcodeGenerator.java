package Mentoring01_07;

import java.util.Scanner;

public class BarcodeGenerator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num1 = Integer.parseInt(scanner.nextLine());
        int num2 = Integer.parseInt(scanner.nextLine());

        int fourthNum1 = num1 % 10;
        int thirdNum1 = num1 / 10 % 10;
        int secondNum1 = num1 / 100 % 10;
        int firstNum1 = num1 / 1000;

        int fourthNum2 = num2 % 10;
        int thirdNum2 = num2 / 10 % 10;
        int secondNum2 = num2 / 100 % 10;
        int firstNum2 = num2 / 1000;

        for (int i = firstNum1; i <= firstNum2 ; i++) {
            if (i % 2 == 0){
                continue;
            }
            for (int j = secondNum1; j <= secondNum2  ; j++) {
                if (j % 2 == 0){
                    continue;
                }
                for (int k = thirdNum1; k <= thirdNum2 ; k++) {
                    if (k % 2 == 0){
                        continue;
                    }
                    for (int l = fourthNum1; l <= fourthNum2 ; l++) {
                        if (l % 2 == 0){
                            continue;
                        }

                        System.out.print("" + i + j + k + l + " ");

                    }
                }
            }
        }
    }
}
