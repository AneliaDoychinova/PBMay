package Mentoring27_05;

import java.util.Scanner;

public class ThreeBrothers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double bigBrotherTime = Double.parseDouble(scanner.nextLine());
        double middleBrotherTime = Double.parseDouble(scanner.nextLine());
        double littleBrotherTime = Double.parseDouble(scanner.nextLine());
        double fatherTime = Double.parseDouble(scanner.nextLine());

        double cleaningTime = 1 / (1 / bigBrotherTime + 1 / middleBrotherTime
                + 1 / littleBrotherTime);

        cleaningTime = cleaningTime + (cleaningTime * 0.15);

        System.out.printf("Cleaning time: %.2f%n", cleaningTime);

        if (cleaningTime < fatherTime){
            System.out.printf("Yes, there is a surprise - time left -> %.0f hours.",
                    Math.floor(fatherTime - cleaningTime));
        }else {
            System.out.printf("No, there isn't a surprise - shortage of time -> %.0f hours.",
                    Math.ceil(cleaningTime - fatherTime));
        }
    }
}
