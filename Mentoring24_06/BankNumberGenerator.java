package Mentoring24_06;

import java.util.Scanner;

public class BankNumberGenerator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = Integer.parseInt(scanner.nextLine());
        char b = scanner.nextLine().charAt(0);
        char c = scanner.nextLine().charAt(0);
        char d = scanner.nextLine().charAt(0);
        int e = Integer.parseInt(scanner.nextLine());
        int n = Integer.parseInt(scanner.nextLine());

        int cnt = 0;

        for (int i = a; i <= 99 ; i++) {
            for (char j = b; j <= 'Z' ; j++) {
                for (char k = c; k <= 'z' ; k++) {
                    for (char l = d; l <= 'Z' ; l++) {
                        for (int m = e; m >= 10 ; m--) {
                            if (i % 10 == 2 && m % 10 == 5){
                               cnt++;
                            }

                            if (cnt == n){
                                System.out.println("" + i + j + k + l + m);
                                return;
                            }
                        }
                    }
                }
            }
        }
    }
}
