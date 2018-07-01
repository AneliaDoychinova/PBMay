package Mentoring01_07;

import java.util.Scanner;

public class GroupName {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char c1 = scanner.nextLine().charAt(0);
        char c2 = scanner.nextLine().charAt(0);
        char c3 = scanner.nextLine().charAt(0);
        char c4 = scanner.nextLine().charAt(0);
        int d1 = Integer.parseInt(scanner.nextLine());

        int cnt = 0;
        for (char i = 'A'; i <= c1 ; i++) {
            for (char j = 'a'; j <= c2 ; j++) {
                for (char k = 'a'; k <= c3 ; k++) {
                    for (char l = 'a'; l <= c4 ; l++) {
                        for (int m = 0; m <= d1 ; m++) {
                            cnt++;
                        }
                    }
                }
            }

        }

        System.out.println(cnt-1);
    }
}
