package MentorMeeting03_06;

import java.util.Scanner;

public class OnTimeForTheExam {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int examHour = Integer.parseInt(scanner.nextLine());
        int examMinutes = Integer.parseInt(scanner.nextLine());
        int arrivalHour = Integer.parseInt(scanner.nextLine());
        int arrivalMinutes = Integer.parseInt(scanner.nextLine());

        int examTotalMinutes = examHour * 60 + examMinutes;
        int arrivalTotalMinutes = arrivalHour * 60 + arrivalMinutes;

        int difference = examTotalMinutes - arrivalTotalMinutes;

        if (difference > 30) {
            System.out.println("Early");

            if (difference > 59) {
                int hours = difference / 60;
                int minutes = difference % 60;

                System.out.printf("%d:%02d hours before the start", hours, minutes);
            } else {
                System.out.printf("%d minutes before the start", difference);
            }
        } else if (difference < 0) {
            System.out.println("Late");
            int minutesLate = Math.abs(difference);

            if (minutesLate > 59) {
                int hours = minutesLate / 60;
                int minutes = minutesLate % 60;

                System.out.printf("%d:%02d hours after the start", hours, minutes);
            } else {
                System.out.printf("%d minutes after the start", minutesLate);
            }

        } else {
            System.out.println("On time");

            if (difference > 0) {
                System.out.printf("%d minutes before the start", difference);
            }
        }
    }
}

