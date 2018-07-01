package Mentoring01_07;

import java.util.Scanner;

public class ControlNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int m = Integer.parseInt(scanner.nextLine());
        int controlNum = Integer.parseInt(scanner.nextLine());

        int totalSum = 0;
        int cnt = 0;

        for (int i = 1; i <= n ; i++) {
            for (int j = m; j >= 1 ; j--) {
                totalSum += i * 2 + j * 3;
                cnt++;

                if (totalSum >= controlNum){
                    System.out.println(cnt + " moves");
                    System.out.printf("Score: %d >= %d", totalSum, controlNum);
                    return;
                }
            }
        }

        System.out.println(cnt + " moves");
    }
}
