import java.util.Scanner;
public class GodzillaVsKong {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budgetForFilming = Double.parseDouble(scanner.nextLine());
        int countOfStatists = Integer.parseInt(scanner.nextLine());
        double priceClothesForOneStatist = Double.parseDouble(scanner.nextLine());

        double priceOfDecor = budgetForFilming * 0.10;
        double sumForClothes = countOfStatists * priceClothesForOneStatist;

        if (countOfStatists > 150){
        sumForClothes *= 0.90;
        }
        double totalSum = priceOfDecor + sumForClothes;

        if (totalSum <= budgetForFilming) {
            System.out.println("Action!" );
            System.out.printf("Wingard starts filming with %.2f leva left.",budgetForFilming - totalSum);
        }
        else{
            System.out.println("Not enough money!");
            System.out.printf("Wingard needs %.2f leva more.",totalSum - budgetForFilming);
        }
    }
}