package MentorMeeting21_05;

import java.util.Scanner;

public class Moon {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double averageSpeed = Double.parseDouble(scanner.nextLine());
        double litersFuel = Double.parseDouble(scanner.nextLine());

        int distance = 384400 * 2;
        int hours = 3;

        double travelHours = Math.ceil(distance / averageSpeed + hours);
        double litersFuelNeeded = distance * litersFuel / 100;

        System.out.printf("%.0f%n", travelHours);
        System.out.println((int)litersFuelNeeded);
    }
}
