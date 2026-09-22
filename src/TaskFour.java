import java.util.Scanner;
public class TaskFour {
    static void main() {
        Scanner scan = new Scanner(System.in);
        int ageOver = 21;
        System.out.println("Please enter your age for a wristband");
        if(scan.hasNextInt()){
            ageOver = scan.nextInt();
            if(ageOver >= 21 && ageOver <= 120) {
                System.out.println("You get a paper wristband");
            }
        }
        else {
            System.out.println("Invalid data type");
        }
    }
}
