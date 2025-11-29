import java.util.Scanner;

/**
 * Write a description of class CinemaTicket here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class CinemaTicket
{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        System.out.println("**** XFX Cinema Ticket System ****");

        System.out.print("Enter your age group (child/adult/senior): ");
        String AgeGroup = in.next().toLowerCase();

        System.out.print("Enter movie language (nepali/hindi/english): ");
        String language = in.next().toLowerCase();

        System.out.print("Are you a student? (yes/no): ");
        String student = in.next().toLowerCase();

        System.out.print("Is it a festival day? (yes/no): ");
        String festival = in.next().toLowerCase();
       
        double price;

        if (AgeGroup.equals("child")) {
            price = 150;
        } else if (AgeGroup.equals("adult")) {
            price = 250;
        } else if (AgeGroup.equals("senior")) {
            price = 200;
        } else {
            System.out.println("Invalid age group entered.");
            return;
        }

        
        if (language.equals("hindi")) {
            price += 50;
        } else if (language.equals("english")) {
            price += 100;
        } else if (!language.equals("nepali")) {
            System.out.println("Invalid language entered.");
            return;
        }

        
        if (student.equals("yes")) {
            price -= price * 0.20;   
        }

        
        if (festival.equals("yes")) {
            price -= price * 0.15;   
        }

        System.out.println("=============================");
        System.out.println("  Final Ticket Price: Rs. " + price);
        System.out.println("=============================");
    }
}
    
