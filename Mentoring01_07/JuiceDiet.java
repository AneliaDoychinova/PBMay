package Mentoring01_07;

import java.util.Scanner;

public class JuiceDiet {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int raspberriesCount = Integer.parseInt(scanner.nextLine());
        int strawberriesCount = Integer.parseInt(scanner.nextLine());
        int cherriesCount = Integer.parseInt(scanner.nextLine());
        int limitJuice = Integer.parseInt(scanner.nextLine());

        double cherriesJuice = 15;
        double strawberriesJuice = 7.5;
        double raspberriesJuice = 4.5;

        double maxJuice = 0;
        int rCount = 0;
        int sCount = 0;
        int cCount = 0;

        for (int i = 0; i <= cherriesCount; i++) {
            for (int j = 0; j <= strawberriesCount ; j++) {
                for (int k = 0; k <= raspberriesCount; k++) {
                    double currentJuice = k * raspberriesJuice +
                            j * strawberriesJuice + i * cherriesJuice;

                    if (currentJuice <= limitJuice) {
                        if (currentJuice >= maxJuice) {
                            maxJuice = currentJuice;
                            cCount = i;
                            sCount = j;
                            rCount = k;
                        }
                    }

                }
            }
        }

        System.out.printf("%d Raspberries, %d Strawberries, %d Cherries. Juice: %f ml.",
                rCount, sCount, cCount, maxJuice);


    }
}
