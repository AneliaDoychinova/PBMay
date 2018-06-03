package MentorMeeting03_06;

import java.util.Scanner;

public class Trip {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        String season = scanner.nextLine();

        double price = 0;
        String typeOfHoliday = "";

        if (budget <= 100){
            System.out.println("Somewhere in Bulgaria");

            if (season.equals("summer")){
                typeOfHoliday = "Camp";
                price = 0.3 * budget;
            } else {
                typeOfHoliday = "Hotel";
                price = 0.7 * budget;
            }

        } else if (budget <= 1000) {
            System.out.println("Somewhere in Balkans");

            if (season.equals("summer")){
                typeOfHoliday = "Camp";
                price = 0.4 * budget;
            } else {
                typeOfHoliday = "Hotel";
                price = 0.8 * budget;
            }
        } else {
            System.out.println("Somewhere in Europe");
            typeOfHoliday = "Hotel";
            price = 0.9 * budget;
        }

        System.out.printf("%s - %.2f", typeOfHoliday, price);

    }
}
