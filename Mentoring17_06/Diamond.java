package Mentoring17_06;

import java.util.Scanner;

public class Diamond {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int starsCount = 0;
        int rows = 0;

        if (n % 2 == 0){
            starsCount = 2;
            rows = n - 1;
        } else {
            starsCount = 1;
            rows = n;
        }

        int dashesCount = (n - starsCount) / 2;

        String firstLastRow = repeatStr("-", dashesCount) +
                repeatStr("*", starsCount) +
                repeatStr("-", dashesCount);

        //FirstRow
        System.out.println(firstLastRow);
        dashesCount--;

        //MiddlePart
        int middleDashes = n - (2 * dashesCount) - 2;

        for (int i = 0; i < (rows - 1)/2; i++) {
            System.out.print(repeatStr("-", dashesCount));
            System.out.print("*");
            System.out.print(repeatStr("-", middleDashes));
            System.out.print("*");
            System.out.println(repeatStr("-", dashesCount));

            dashesCount--;
            middleDashes += 2;
        }

        //LowerPart
        dashesCount += 2;
        middleDashes -= 4;

        for (int i = 0; i < (rows - 1) / 2 - 1; i++) {
            System.out.print(repeatStr("-", dashesCount));
            System.out.print("*");
            System.out.print(repeatStr("-", middleDashes));
            System.out.print("*");
            System.out.println(repeatStr("-", dashesCount));

            dashesCount++;
            middleDashes -= 2;
        }

        if (n > 2){
            System.out.println(firstLastRow);
        }


    }
    static String repeatStr(String strToRepeat, int count) {
        StringBuilder text = new StringBuilder();

        for (int i = 0; i < count; i++) {
            text.append(strToRepeat);
        }
        return text.toString();
    }
}
