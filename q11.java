import java.util.Scanner;

/**
 * Write a description of class q11 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class q11
{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter your annual income(NPR): ");
        int income= scan.nextInt();
        double tax;

        if (income <= 500000) {
            tax = income * 0.01;
            System.out.println(tax);
        } 
        else if (income >= 500001 && income <= 700000) {
            tax = 5000 + (0.1 * income);
            System.out.println(tax);
        } 
        else if (income>=700001 && income <= 1000000) {
            tax = 15000 + (0.2 * income);
            System.out.println(tax);
        } 
        else if (income>=1000001 && income <= 2000000) {
            tax = 35000 + (0.3 * income);
            System.out.println(tax);
        } 
        else if (income>=2000001 && income <= 5000000) {
            tax = 335000 + (0.36 * income);
            System.out.println(tax);
        } else {
            tax = 1135000 + (0.39 * income) ;
            System.out.println(tax);
        }
}
}
