import java.util.Scanner;
public class TaskThree {
    static void main() {
        Scanner scan = new Scanner(System.in);
        System.out.println("input your party affiliation D, R, or I");
        String party;
        party = scan.nextLine();
        if (party.equalsIgnoreCase("R")){
            System.out.println("You get a Republican Elephant ");
        }
        else if (party.equalsIgnoreCase("D")){
            System.out.println("You get a Democratic Donkey");
        }
        else if (party.equalsIgnoreCase("I")){
            System.out.println("You get an Independent Person");
        }
        else{
            System.out.println("Please enter a valid party type");
        }
    }
}
