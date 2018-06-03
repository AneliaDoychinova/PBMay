package MentorMeeting03_06;

import java.util.Scanner;

public class FruitShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String fruit = scanner.nextLine().toLowerCase();
        String dayOfWeek = scanner.nextLine();
        double quantity = Double.parseDouble(scanner.nextLine());

        double price = 0;

        if (dayOfWeek.equalsIgnoreCase("monday") ||
                dayOfWeek.equalsIgnoreCase("tuesday") ||
                dayOfWeek.equalsIgnoreCase("wednesday") ||
                dayOfWeek.equalsIgnoreCase("thursday") ||
                dayOfWeek.equalsIgnoreCase("friday")){

            switch (fruit){
                case "banana":
                   price = 2.5;
                    break;
                case "apple":
                    price = 1.2;
                    break;
                case "orange":
                    price = 0.85;
                    break;
                case "grapefruit":
                    price = 1.45;
                    break;
                case "kiwi":
                    price = 2.7;
                    break;
                case "pineapple":
                    price = 5.5;
                    break;
                case "grapes":
                    price = 3.85;
                    break;
            }
        } else if (dayOfWeek.equalsIgnoreCase("saturday") ||
                dayOfWeek.equalsIgnoreCase("sunday")){

            switch (fruit){
                case "banana":
                    price = 2.7;
                    break;
                case "apple":
                    price = 1.25;
                    break;
                case "orange":
                    price = 0.9;
                    break;
                case "grapefruit":
                    price = 1.6;
                    break;
                case "kiwi":
                    price = 3;
                    break;
                case "pineapple":
                    price = 5.6;
                    break;
                case "grapes":
                    price = 4.2;
                    break;
            }
        }

        if (price == 0){
            System.out.println("error");
        } else {
            double totalSum = price * quantity;
            System.out.printf("%.2f", totalSum);
        }

    }
}
