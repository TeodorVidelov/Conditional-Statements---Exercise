import java.util.Scanner;
public class ToyShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double priceOfExcursion = Double.parseDouble(scanner.nextLine());
        int countPuzzles = Integer.parseInt(scanner.nextLine());
        int countTalkingDolls = Integer.parseInt(scanner.nextLine());
        int countTeddyBears = Integer.parseInt(scanner.nextLine());
        int countMinions = Integer.parseInt(scanner.nextLine());
        int countTrucks = Integer.parseInt(scanner.nextLine());

        double puzzlePrice = 2.60;
        double talkingDollPrice = 3;
        double teddyBearPrice = 4.10;
        double minionPrice = 8.20;
        double truckPrice = 2;

        double sum = countPuzzles * puzzlePrice + talkingDollPrice * countTalkingDolls + teddyBearPrice * countTeddyBears
        + minionPrice * countMinions + truckPrice * countTrucks;

        int countToys = countPuzzles + countTalkingDolls + countTeddyBears + countMinions + countTrucks;
        if (countToys >= 50){
            sum *= 0.75;
        }
        double sumForRent = sum * 0.10;
        double totalSum = sum - sumForRent;

        if (totalSum >= priceOfExcursion){
            System.out.printf("Yes! %.2f lv left.",totalSum - priceOfExcursion);
        }
        else {
            System.out.printf("Not enough money! %.2f lv needed.",priceOfExcursion - totalSum);
        }
    }
}