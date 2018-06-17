package Mentoring17_06;

import java.util.Scanner;

public class Sunglasses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        String firstLastRow = repeatStr("*", n * 2) +
                repeatStr(" ",n) + repeatStr("*", n * 2);

        //FirstRow
        System.out.println(firstLastRow);

        //MiddlePart

        for (int i = 0; i < n - 2; i++) {
            System.out.print("*");
            for (int j = 0; j < n * 2 -2; j++) {
                System.out.print("/");
            }
            System.out.print("*");

            if (i == (n -1)/2 - 1){
                for (int j = 0; j < n; j++) {
                    System.out.print("|");
                }
            }else {
                for (int j = 0; j < n; j++) {
                    System.out.print(" ");
                }
            }

            System.out.print("*");
            for (int j = 0; j < n * 2 -2; j++) {
                System.out.print("/");
            }
            System.out.println("*");

        }

        //LastRow
        System.out.println(firstLastRow);

    }
    static String repeatStr(String strToRepeat, int count) {
        StringBuilder text = new StringBuilder();

        for (int i = 0; i < count; i++) {
            text.append(strToRepeat);
        }
        return text.toString();
    }
}
