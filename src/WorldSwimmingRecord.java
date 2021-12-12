import java.util.Scanner;
public class WorldSwimmingRecord {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double recordInSeconds = Double.parseDouble(scanner.nextLine());
        double distanceInMeters = Double.parseDouble(scanner.nextLine());
        double secondsForSwimmingOneMeter = Double.parseDouble(scanner.nextLine());


        double slowingEach15Meters = Math.floor(distanceInMeters / 15) * 12.5;
        double totalTime = distanceInMeters * secondsForSwimmingOneMeter + slowingEach15Meters;

        if (recordInSeconds > totalTime){
            System.out.printf("Yes, he succeeded! The new world record is %.2f seconds.",totalTime);
        }
        else {
            System.out.printf("No, he failed! He was %.2f seconds slower.",totalTime - recordInSeconds);
        }
    }
}