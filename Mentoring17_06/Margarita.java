package Mentoring17_06;

import java.util.Scanner;

public class Margarita {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int rows = 7 * n + 3;
        int cols = 8 * n + 2;

        int apostropheCount = 1;
        //FirstRow
        System.out.println(repeatStr("'", apostropheCount) +"&$"
                + repeatStr("'", cols - 3));
        apostropheCount++;

        //Straw
        for (int i = 0; i < n - 1; i++) {
            System.out.println(repeatStr("'", apostropheCount) + "\\" +
            repeatStr("'", cols - apostropheCount - 1));
            apostropheCount++;
        }

        //Sugar
        System.out.println(repeatStr("^*", cols / 2 - 1) + "^'");

        //SomePart
        int leftApostrophe = 0;
        int rightApostrophe = 1;

        for (int i = 0; i < n - 1; i++) {
            System.out.print(repeatStr("'", leftApostrophe));
            System.out.print("\\\\");
            System.out.print(repeatStr(" ", n));
            System.out.print("\\");
            System.out.print(repeatStr(" ",
                    cols - leftApostrophe - rightApostrophe - 5 - n));
            System.out.print("//");
            System.out.println(repeatStr("'", rightApostrophe));

            rightApostrophe++;
            leftApostrophe++;
        }

        System.out.println(repeatStr("'", leftApostrophe) + "\\" +
        repeatStr("~", cols - leftApostrophe - rightApostrophe - 2) +
        "/" + repeatStr("'", rightApostrophe));
        leftApostrophe++;
        rightApostrophe++;

        int symbol = cols - leftApostrophe - rightApostrophe - 2;
        for (int i = 0; i < 3 * n -1; i++) {
            System.out.print(repeatStr("'", leftApostrophe));
            System.out.print("\\");

            if (i == n - 2 || i == 3 * n - 2){
                System.out.print(repeatStr("_",symbol));
            } else if (i == n - 1){
                System.out.print(repeatStr(".", symbol));
            } else {
                System.out.print(repeatStr(" ", symbol));
            }

            System.out.print("/");
            System.out.println(repeatStr("'", rightApostrophe));

            leftApostrophe++;
            rightApostrophe++;
            symbol -= 2;

        }

        //Handle
        for (int i = 0; i < 2 * n + 1; i++) {
            System.out.println(repeatStr("'",leftApostrophe) + "|||" +
            repeatStr("'", rightApostrophe));
        }

        //BeforeLastRow
        System.out.println(repeatStr("_", cols - 1) + "'");

        //LastRow
        System.out.println("'" + repeatStr("-", cols - 3) + "''");


    }
    static String repeatStr(String strToRepeat, int count) {
        StringBuilder text = new StringBuilder();

        for (int i = 0; i < count; i++) {
            text.append(strToRepeat);
        }
        return text.toString();
    }
}
