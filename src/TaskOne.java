import java.util.Scanner;
public class TaskOne {
    static void main() {
        Scanner scan = new Scanner(System.in);
        double costOfItem = 0;
        double totalCost;
        System.out.println("Input the price of your item");
        if(scan.hasNextDouble()){
            costOfItem = scan.nextDouble();
            if(costOfItem > 100){
                System.out.println("your shipping is free your total is $" + costOfItem);
                System.exit(0);
            } else if (costOfItem < 0) {
                System.out.println("Please enter a valid cost");

            }
            else{
                totalCost = (costOfItem * 0.02) + costOfItem;
                System.out.println("Your cost with shipping is $" + totalCost);
            }
        }
        else {
            System.out.println("Invalid data type");
            System.exit(0);
        }
    }
}
