package Mentoring01_07;

import java.util.Scanner;

public class EnergyLoss {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int days = Integer.parseInt(scanner.nextLine());
        int dancers = Integer.parseInt(scanner.nextLine());

        double totalEnergy = 100 * days * dancers;

        for (int i = 1; i <= days; i++) {
            int hours = Integer.parseInt(scanner.nextLine());

            if (i % 2 == 0 && hours % 2 == 0){
                totalEnergy -= 68 * dancers;
            } else if (i % 2 == 0 && hours % 2 == 1){
                totalEnergy -= 65 * dancers;
            } else if (i % 2 == 1 && hours % 2 == 1){
                totalEnergy -= 30 * dancers;
            } else{
                totalEnergy -= 49 * dancers;
            }

        }
        double energyConsumption = totalEnergy / dancers / days;
        if (energyConsumption >= 50){
            System.out.printf("They feel good! Energy left: %.2f",energyConsumption);
        } else {
            System.out.printf("They are wasted! Energy left: %.2f", energyConsumption);
        }
    }
}
