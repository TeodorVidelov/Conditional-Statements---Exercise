import java.util.Scanner;
public class TimePlus15Minutes{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int hours = Integer.parseInt(scanner.nextLine());
        int minutes = Integer.parseInt(scanner.nextLine());

        int timeInMinutesPlus15 = hours * 60 + minutes + 15;

        int h = timeInMinutesPlus15 / 60;
        int m = timeInMinutesPlus15 % 60;

        if (h >= 24){
            h = h - 24;
        }
        if (m < 10){
            System.out.printf("%d:0%d",h,m);
        }
        else {
            System.out.printf("%d:%d",h,m);
        }
    }
}