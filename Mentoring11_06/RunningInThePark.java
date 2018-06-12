package Mentoring11_06;

import java.util.Scanner;

public class RunningInThePark {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int days = Integer.parseInt(scanner.nextLine());

        double totalTime = 0;
        double totalDistanceKm = 0;


        for (int i = 0; i < days; i++) {
            double currentMinutes = Double.parseDouble(scanner.nextLine());
            double currentDistance = Double.parseDouble(scanner.nextLine());
            String measurement = scanner.nextLine();

            if (measurement.equals("m")){
                totalDistanceKm += currentDistance / 1000;
            } else {
                totalDistanceKm += currentDistance;
            }

            totalTime += currentMinutes;
        }

        double totalCalories = totalTime / 20 * 400;

        System.out.printf("He ran %.2fkm for %.0f minutes and burned %.0f calories.",
                totalDistanceKm, totalTime, totalCalories);
    }
}
