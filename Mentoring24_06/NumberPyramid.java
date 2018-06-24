package Mentoring24_06;

import java.util.Scanner;

public class NumberPyramid {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int currentNum = 1;

        for (int i = 1; ; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(currentNum++ + " ");

                if (currentNum > n){
                    return;
                }
            }
            System.out.println();
        }

    }
}
