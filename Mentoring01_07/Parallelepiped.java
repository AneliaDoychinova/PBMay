package Mentoring01_07;

import java.util.Scanner;

public class Parallelepiped {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int rows = 4 * n + 4;
        int cols = 3 * n + 1;

        int consoleCount = n - 2;
        int dotsCount = 2 * n + 1;

        String console = repeat("~",consoleCount);
        //FirstRow
        System.out.println("+" + console + "+" +
        repeat(".", dotsCount));

        //UpperPart

        int leftDotsCount = 0;
        for (int i = 0; i < 2 * n + 1; i++) {
            System.out.print("|");
            System.out.print(repeat(".", leftDotsCount++));
            System.out.print("\\");
            System.out.print(console);
            System.out.print("\\");
            System.out.println(repeat(".", --dotsCount));
        }

        //LowerPart

        for (int i = 0; i < 2 * n + 1; i++) {
            System.out.print(repeat(".", dotsCount++));
            System.out.print("\\");
            System.out.print(repeat(".", --leftDotsCount));
            System.out.print("|");
            System.out.print(console);
            System.out.println("|");
        }

        //LastRow
        System.out.print(repeat(".", dotsCount));
        System.out.println("+" + console + "+");

    }

    static String repeat(String strToRepeat, int count) {
        String text = "";
        for (int i = 0; i < count; i++) {
            text = text + strToRepeat;
        }
        return text;
    }
}
