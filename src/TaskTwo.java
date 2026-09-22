import java.util.Scanner;
public class TaskTwo {
    static void main() {
        Scanner scan = new Scanner(System.in);
        int birthMonth;
        System.out.println("Input your birth month number");
        if(scan.hasNextInt()){
             birthMonth = scan.nextInt();
            if(birthMonth >= 1 && birthMonth <= 12) {
                System.out.println("your birth month is " + birthMonth);
                System.exit(0);
            }
            else{
                System.out.println("Please enter a valid month");
            }
        }
        else {
            System.out.println("Invalid data type");
            System.exit(0);
        }
    }
}
