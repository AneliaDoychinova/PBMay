package Mentoring24_06;

import java.util.Scanner;

public class NumberTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int previousNum = 0;
        for (int row = 0; row < n; row++) {
            for (int col = 0; col < n; col++) {
                int currentNum = row + col + 1;

                if (currentNum > n){
                    currentNum = previousNum - 1;
                }
                System.out.print(currentNum + " ");
                previousNum = currentNum;
            }
            System.out.println();
        }
    }
}
