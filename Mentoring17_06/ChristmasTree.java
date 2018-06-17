package Mentoring17_06;

import java.util.Scanner;

public class ChristmasTree {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        //FirstRow
        System.out.println(repeatStr(" ",n+1) + "|");

        //LowerPart

        for (int i = 1; i <= n; i++) {
            System.out.println(repeatStr(" ", n - i) + repeatStr("*",i) +
            " | " + repeatStr("*",i));
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
