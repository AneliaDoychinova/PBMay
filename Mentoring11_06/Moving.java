package Mentoring11_06;

import java.util.Scanner;

public class Moving {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int width = Integer.parseInt(scanner.nextLine());
        int length = Integer.parseInt(scanner.nextLine());
        int height = Integer.parseInt(scanner.nextLine());

        int volumeSpace = width * length * height;
        int volumeBox = 1;
        int boxCount = 0;

        String line = scanner.nextLine();

        while (!line.equals("Done")) {
            int boxes = Integer.parseInt(line);
            boxCount += boxes;

            if (boxCount * volumeBox > volumeSpace) {
                System.out.printf("No more free space! You need %d Cubic meters more.",
                        boxCount * volumeBox - volumeSpace);
                return;
            }
            line = scanner.nextLine();
        }

        System.out.printf("%d Cubic meters left.",volumeSpace - boxCount * volumeBox);

    }
}
