
import java.util.Scanner;

public class FreeTimeOrWorkTime {
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Time:");
        int hour = scan.nextInt();

        if (hour == 12 ) {
            System.out.println("Free Time");
        } else if (hour > 8 && hour < 12) {
            System.out.println("Work Time");
        } else if (hour > 13 && hour < 16){
            System.out.println("Work Time");
        } else {
            System.out.println("Free Time");
        }
    }
}
