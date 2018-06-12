package Mentoring11_06;

import java.util.Scanner;

public class PadawanEquipment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double money = Double.parseDouble(scanner.nextLine());
        int countStudents = Integer.parseInt(scanner.nextLine());
        double lightsabersPrice = Double.parseDouble(scanner.nextLine());
        double robesPrice = Double.parseDouble(scanner.nextLine());
        double beltsPrice = Double.parseDouble(scanner.nextLine());

        double lightsabersCount = Math.ceil(countStudents * 1.1);
        int robesCount = countStudents;
        int beltsCount = countStudents - countStudents / 6;

        double totalPrice = lightsabersCount * lightsabersPrice +
                robesCount * robesPrice + beltsCount * beltsPrice;

        if (totalPrice <= money){
            System.out.printf("The money is enough - it would cost %.2flv.",
                    totalPrice);
        } else {
            System.out.printf("Ivan Cho will need %.2flv more.",
                    totalPrice - money);
        }
    }
}
