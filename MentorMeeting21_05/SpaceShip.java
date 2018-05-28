package MentorMeeting21_05;

import java.util.Scanner;

public class SpaceShip {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double width = Double.parseDouble(scanner.nextLine());
        double length = Double.parseDouble(scanner.nextLine());
        double height = Double.parseDouble(scanner.nextLine());
        double astronautsAvgHeight = Double.parseDouble(scanner.nextLine());

        double volumeSpaceship = width * length * height;

        double widthRoom = 2;
        double lengthRoom = 2;
        double heightRoom = astronautsAvgHeight + 0.4;

        double volumeRoom = widthRoom * lengthRoom * heightRoom;

        int roomsCount = (int) Math.floor(volumeSpaceship / volumeRoom);
        int astronautsCount = roomsCount;

        if (astronautsCount < 3){
            System.out.println("The spacecraft is too small.");
        }else if (astronautsCount <= 10){
            System.out.printf("The spacecraft holds %d astronauts.",astronautsCount);
        }else {
            System.out.println("The spacecraft is too big.");
        }
    }
}
