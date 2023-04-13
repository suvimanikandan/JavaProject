
import java.util.Scanner;

public class Main {
        public static Scanner input=new Scanner(System.in);
        public static int choice,quantity=1;
        public static double total=0,pay;
        public static String again;
        public  static void menu(){
            System.out.println("_____________________________________________________");
            System.out.println("\t WELCOME to our Restaurant");
            System.out.println("\t Restaurant Menu");
            System.out.println("\t1.Burger    BDT $80.00");
            System.out.println("\t2.Pizza     BDT $100.00");
            System.out.println("\t3.Coffee    BDT $60.00");
            System.out.println("\t4.Cancel    ");
        }
        public static void order() {
            System.out.println("1 to Burger || 2 to pizza  || 3 toCoffee");
            System.out.println("Press you want to order ");
            choice = input.nextInt();
            if (choice == 1) {
                System.out.println("You choice burger");
                System.out.println("How many Burger you to want: ");
                quantity = input.nextInt();
                total += quantity * 80;
                System.out.println("You want to buy again : ");
                System.out.println("Press Y for [yes] and N for [No]");
                again = input.next();
                if (again.equalsIgnoreCase("Y"))
                    order();
                else {
                    System.out.println("Enter Payment: ");
                    pay = input.nextDouble();
                    if (pay < total)
                        System.out.println("No, Need more");
                    else {
                        System.out.println("total = " + total);
                        total = pay - total;
                        System.out.println("Customer's return " + total + "tk");
                    }
                }
            } else if (choice == 2) {
                System.out.println("You choice Pizza");
                System.out.println("How many Pizza you to want: ");
                quantity = input.nextInt();
                total += quantity * 100;
                System.out.println("You want to buy again : ");
                System.out.println("Press Y for [yes] and N for [No]");
                again = input.next();
                if (again.equalsIgnoreCase("Y"))
                    order();
                else {
                    System.out.println("Enter Payment: ");
                    pay = input.nextDouble();
                    if (pay < total)
                        System.out.println("No, Need more");
                    else {
                        System.out.println("total = " + total);
                        total = pay - total;
                        System.out.println("Customer's return " + total + "tk");
                    }
                }
            } else if (choice == 3) {
                System.out.println("You choice coffee");
                System.out.println("How many coffee you to want: ");
                quantity = input.nextInt();
                total += quantity * 60;
                System.out.println("You want to buy again : ");
                System.out.println("Press Y for [yes] and N for [No]");
                again = input.next();
                if (again.equalsIgnoreCase("Y"))
                    order();
                else {
                    System.out.println("Enter Payment: ");
                    pay = input.nextDouble();
                    if (pay < total)
                        System.out.println("No, Need more");
                    else {
                        System.out.println("total = " + total);
                        total = pay - total;
                        System.out.println("Customer's return " + total + "tk");
                    }
                }
            } else if (choice == 4) {
                System.exit(0);
            } else {
                System.out.println("Choose  a food in this items: ");
                order();
            }
        }
            public static void main(String[] args) {
            menu();
            order();
    }
}