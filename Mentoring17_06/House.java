package Mentoring17_06;

import java.util.Scanner;

public class House {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int starsCount = 0;

        if (n % 2 == 0){
            starsCount = 2;
        } else {
            starsCount = 1;
        }

        int dashesCount = (n - starsCount)/2;

        for (int i = 0; i < (n + 1)/2; i++) {
            System.out.print(repeatStr("-", dashesCount));
            System.out.print(repeatStr("*", starsCount));
            System.out.println(repeatStr("-", dashesCount));

            starsCount += 2;
            dashesCount--;

        }

        for (int i = 0; i < n / 2; i++) {

            System.out.print("|");
            System.out.print(repeatStr("*", n - 2));
            System.out.println("|");
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
