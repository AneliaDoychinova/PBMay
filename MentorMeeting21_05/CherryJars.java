package MentorMeeting21_05;

import java.util.Scanner;

public class CherryJars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int compoteCount = Integer.parseInt(scanner.nextLine());
        int jamCount = Integer.parseInt(scanner.nextLine());

        double cherriesCompote = 0.3;
        double cherriesJam = 0.65;
        double cherriesPrice = 3.20;

        int totalCompote = compoteCount + 1;
        int totalJam = jamCount + 1;

        double totalCherriesCompote = totalCompote * cherriesCompote * 1.05;
        double totalCherriesJam = totalJam * cherriesJam * 1.1;

        double totalPrice = (totalCherriesCompote + totalCherriesJam) * cherriesPrice;

        System.out.printf("%.2f", totalPrice);

    }
}
