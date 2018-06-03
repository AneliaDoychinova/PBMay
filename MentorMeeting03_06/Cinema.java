package MentorMeeting03_06;

import java.util.Scanner;

public class Cinema {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String type = scanner.nextLine();
        int rows = Integer.parseInt(scanner.nextLine());
        int cols = Integer.parseInt(scanner.nextLine());

        double premierePrice = 12;
        double normalPrice = 7.5;
        double discountPrice = 5;

        int seats = rows * cols;

        switch (type){
            case "Premiere":
                System.out.printf("%.2f leva", seats * premierePrice);
                break;
            case "Normal":
                System.out.printf("%.2f leva", seats * normalPrice);
                break;
            case "Discount":
                System.out.printf("%.2f leva", seats * discountPrice);
                break;
        }
    }
}
