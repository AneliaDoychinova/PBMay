package MentorMeeting21_05;

import java.util.Scanner;

public class MiningRig {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int videoCardPrice = Integer.parseInt(scanner.nextLine());
        int adapterPrice = Integer.parseInt(scanner.nextLine());
        double priceElectricityPerCard = Double.parseDouble(scanner.nextLine());
        double profitPerVideoCard = Double.parseDouble(scanner.nextLine());

        int videoCardsTotalPrice = 13 * videoCardPrice;
        int adapterTotalPrice = 13 * adapterPrice;
        int otherStuff = 1000;

        int totalCost = videoCardsTotalPrice + adapterTotalPrice + otherStuff;

        double profitPerDay = 13 * (profitPerVideoCard - priceElectricityPerCard);
        double days = Math.ceil(totalCost / profitPerDay);

        System.out.println(totalCost);
        System.out.printf("%.0f",days);
    }
}
