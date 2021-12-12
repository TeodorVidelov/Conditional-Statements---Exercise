import java.util.Scanner;
public class Shopping {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        int countVideoCards = Integer.parseInt(scanner.nextLine());
        int countProcessors = Integer.parseInt(scanner.nextLine());
        int countRAM = Integer.parseInt(scanner.nextLine());

        double sumVideoCards = 250 * countVideoCards;
        double sumProcessor = (sumVideoCards * 0.35) * countProcessors;
        double sumRAM = (sumVideoCards * 0.10) * countRAM;
        double totalSum = sumRAM + sumProcessor + sumVideoCards;

        if (countVideoCards > countProcessors){
            totalSum *= 0.85;
        }
        if (budget >= totalSum){
            System.out.printf("You have %.2f leva left!",budget - totalSum);
        }
        else {
            System.out.printf("Not enough money! You need %.2f leva more!",totalSum - budget);
        }
    }
}