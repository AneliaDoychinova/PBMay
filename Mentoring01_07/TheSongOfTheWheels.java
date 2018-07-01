package Mentoring01_07;

import java.util.Scanner;

public class TheSongOfTheWheels {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int controlNum = Integer.parseInt(scanner.nextLine());

        int cnt = 0;
        String resultPassword = "No!";

        for (int i = 1; i <= 9 ; i++) {
            for (int j = 1; j <= 9 ; j++) {
                for (int k = 1; k <= 9 ; k++) {
                    for (int l = 1; l <= 9 ; l++) {
                        if (i < j && k > l && controlNum == i * j + k * l){
                            cnt++;
                            System.out.print("" + i + j + k + l + " ");

                            if (cnt == 4){
                                resultPassword = "Password: " + i + j + k +l;
                            }
                        }
                    }
                }
            }
        }
        System.out.println();
        System.out.println(resultPassword);
    }
}
