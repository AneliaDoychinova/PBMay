package Mentoring11_06;

import java.util.Scanner;

public class Workout {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int days = Integer.parseInt(scanner.nextLine());
        double initialKm = Double.parseDouble(scanner.nextLine());

        double totalKm = initialKm;
        double previousDayKm = initialKm;

        for (int i = 0; i < days; i++) {
            int percents = Integer.parseInt(scanner.nextLine());
            double todayKm = previousDayKm + (previousDayKm * percents * 0.01);
            totalKm += todayKm;

            previousDayKm = todayKm;
        }

        if (totalKm >= 1000){
            System.out.printf("You've done a great job running %.0f more kilometers!",
                    Math.ceil(totalKm - 1000));
        }else {
            System.out.printf("Sorry Mrs. Ivanova, you need to run %.0f more kilometers",
                    Math.ceil(1000 - totalKm));
        }

    }
}
