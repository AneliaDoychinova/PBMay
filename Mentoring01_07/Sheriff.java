package Mentoring01_07;

import java.util.Scanner;

public class Sheriff {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int rows = 2 * n + 8;
        int cols = 3 * n;

        int dots = (cols - 1) / 2;
        //FirstRow
        System.out.print(repeat(".", dots));
        System.out.print("x");
        System.out.println(repeat(".", dots--));

        //SecondRow
        System.out.print(repeat(".", dots));
        System.out.print("/x\\");
        System.out.println(repeat(".", dots));

        //ThirdRow
        System.out.print(repeat(".", dots));
        System.out.print("x|x");
        System.out.println(repeat(".", dots));

        //UpperPart
        dots = n / 2;
        int x = n;

        for (int i = 0; i < n; i++) {
            System.out.print(repeat(".", dots));
            System.out.print(repeat("x", x));
            System.out.print("|");
            System.out.print(repeat("x", x));
            System.out.println(repeat(".", dots));

            if (i < n / 2){
                x++;
                dots--;
            } else {
                x--;
                dots++;
            }

        }

        //MiddlePart
        dots = (cols - 3) / 2;

        System.out.print(repeat(".", dots));
        System.out.print("/x\\");
        System.out.println(repeat(".", dots));

        System.out.print(repeat(".", dots));
        System.out.print("\\x/");
        System.out.println(repeat(".", dots));

        //LowerPart
        dots = n / 2;
        x = n;

        for (int i = 0; i < n; i++) {
            System.out.print(repeat(".", dots));
            System.out.print(repeat("x", x));
            System.out.print("|");
            System.out.print(repeat("x", x));
            System.out.println(repeat(".", dots));

            if (i < n / 2){
                x++;
                dots--;
            } else {
                x--;
                dots++;
            }

        }
        dots = (cols - 3) / 2;

        System.out.print(repeat(".", dots));
        System.out.print("x|x");
        System.out.println(repeat(".", dots));

        System.out.print(repeat(".", dots));
        System.out.print("\\x/");
        System.out.println(repeat(".", dots++));

        System.out.print(repeat(".", dots));
        System.out.print("x");
        System.out.println(repeat(".", dots));


    }
    static String repeat(String strToRepeat, int count) {
        String text = "";
        for (int i = 0; i < count; i++) {
            text = text + strToRepeat;
        }
        return text;
    }
}
