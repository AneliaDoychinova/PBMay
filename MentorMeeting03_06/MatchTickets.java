package MentorMeeting03_06;

import java.util.Scanner;

public class MatchTickets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        String category = scanner.nextLine();
        int peopleCount = Integer.parseInt(scanner.nextLine());

        double vipPrice = 499.99;
        double normalPrice = 249.99;

        double transportPrice = 0;

        if (peopleCount <= 4){
            transportPrice = 0.75 * budget;
        } else if (peopleCount <= 9){
            transportPrice = 0.6 * budget;
        } else if (peopleCount <= 24){
            transportPrice = 0.5 * budget;
        } else if (peopleCount <= 49){
            transportPrice = 0.4 * budget;
        } else {
            transportPrice = 0.25 * budget;
        }

        double moneyLeftAfterTransport = budget - transportPrice;

        double totalPriceTickets = 0;

        if (category.equals("VIP")){
            totalPriceTickets = peopleCount * vipPrice;
        } else {
            totalPriceTickets = peopleCount * normalPrice;
        }

        if (moneyLeftAfterTransport >= totalPriceTickets){
            double totalMoneyLeft = moneyLeftAfterTransport - totalPriceTickets;
            System.out.printf("Yes! You have %.2f leva left.", totalMoneyLeft);
        } else {
            System.out.printf("Not enough money! You need %.2f leva.",
                    totalPriceTickets - moneyLeftAfterTransport);
        }

    }
}
