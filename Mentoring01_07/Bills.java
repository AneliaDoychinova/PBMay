package Mentoring01_07;

import java.util.Scanner;

public class Bills {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int months = Integer.parseInt(scanner.nextLine());

        double waterPrice = 20;
        double internetPrice = 15;

        double totalElectricity = 0;
        double totalOthers = 0;

        for (int i = 0; i < months; i++) {
            double currentElectricity = Double.parseDouble(scanner.nextLine());

            totalElectricity += currentElectricity;
            totalOthers += (currentElectricity + waterPrice + internetPrice) * 1.2;
        }

        double totalWater = months * waterPrice;
        double totalInternet = months * internetPrice;

        double average = (totalElectricity + totalInternet +
                totalOthers + totalWater) / months;

        System.out.printf("Electricity: %.2f lv%n", totalElectricity);
        System.out.printf("Water: %.2f lv%n", totalWater);
        System.out.printf("Internet: %.2f lv%n", totalInternet);
        System.out.printf("Other: %.2f lv%n", totalOthers);
        System.out.printf("Average: %.2f lv%n", average);


    }
}
