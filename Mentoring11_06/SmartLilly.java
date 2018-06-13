package Mentoring11_06;

import java.util.Scanner;

public class SmartLilly {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int age = Integer.parseInt(scanner.nextLine());
        double washingMachinePrice = Double.parseDouble(scanner.nextLine());
        int toyPrice = Integer.parseInt(scanner.nextLine());

        double moneyPresent = 10;
        double totalMoney = 0;
        int toysCount = 0;

        for (int i = 1; i <= age ; i++) {
            if (i % 2 == 1){
                toysCount++;
            }else {
                totalMoney += moneyPresent - 1;
                moneyPresent += 10;
            }
        }

        totalMoney += toysCount * toyPrice;

        if (totalMoney >= washingMachinePrice){
            System.out.printf("Yes! %.2f", totalMoney - washingMachinePrice);
        } else {
            System.out.printf("No! %.2f",washingMachinePrice - totalMoney);
        }
    }
}
