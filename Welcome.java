import java.util.Scanner;
public class Welcome {
       public static void main(String[] args){
            Scanner input = new Scanner(System.in);
            System.out.print("Enter your first name");
            String Firstname = input.nextLine();
            System.out.print("Enter your lastname");
            String Lastname = input.nextLine();
            System.out.println("Welcome to the second year" + Firstname + " " + Lastname);
            }
       }