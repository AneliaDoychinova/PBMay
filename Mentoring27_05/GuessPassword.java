package Mentoring27_05;

import java.util.Scanner;

public class GuessPassword {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String secretPassword = "s3cr3t!P@ssw0rd";

        String password = scanner.nextLine();

        if (password.equalsIgnoreCase(secretPassword)) {
            System.out.println("Welcome");
        }else {
            System.out.println("Wrong password!");
        }
    }
}
