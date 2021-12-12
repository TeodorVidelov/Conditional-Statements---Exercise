import java.util.Scanner;
public class LunchBreak {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String serialName = scanner.nextLine();
        int episodeTime = Integer.parseInt(scanner.nextLine());
        int breakTime = Integer.parseInt(scanner.nextLine());

        double lunchTime = (breakTime * 1.0) * 1/8;
        double restTime = (breakTime * 1.0) * 1/4;
        double timeLeft = breakTime - lunchTime - restTime;

        if (timeLeft >= episodeTime){
        System.out.printf("You have enough time to watch %s and left with %.0f minutes free time.",
                serialName,Math.ceil(timeLeft - episodeTime));
        }
        else {
        System.out.printf("You don't have enough time to watch %s, you need %.0f more minutes.",
                serialName,Math.ceil(episodeTime - timeLeft));
        }
    }
}