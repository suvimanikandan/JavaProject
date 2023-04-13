import java.util.Scanner;

public class FoodOrder {
    //fisrt declare our variables for prices of food item
    int frenchfries=100;
    int burger=200;
    int pasta =150;
    int pizza=200;
    int coldCoffee=100;
    int icedTea=100;
    int chickenNuggets=200;
    int coldDrinks=50;
    int ch;
    int quantity;
    static int total;
    Scanner in=new Scanner(System.in);
    String again;

    //lets create a method for displaying our food menu
    //I have tried to make it beautiful

    public void displayMenu(){
        System.out.println("**************** Welcome To Our Cafe *******************");
        System.out.println("________________________________________________________");
        System.out.println("                  1.French Fries         100/-        ");
        System.out.println("                  2.Burger               200/-        ");
        System.out.println("                  3.Pasta                150/-        ");
        System.out.println("                  4.Pizza                200/-        ");
        System.out.println("                  5.ColdCoffee           100/-        ");
        System.out.println("                  6.IcedTea              100/-        ");
        System.out.println("                  7.Chicken Nuggets      200/-        ");
        System.out.println("                  8.Cold Drinks          50/-         ");
        System.out.println("                  9.Exit                              ");
        System.out.println("______________________________________________________");

        System.out.println();
        System.out.println("What do you want?");

    }//our food menu is Ready
    //Lets create a method to order a food item

    //method to create a genrate bill
    public void generateBill(){
        System.out.println();
        System.out.println("****************************Thanks For Ordering*******************************");

        System.out.println("******************** Your bill is "+total+"************************");
    }

    public void order(){
        while(true){
        System.out.println("Enter your choice: ");
        ch= in.nextInt();
        switch(ch) {
            case 1:
                System.out.println("You have selected in French fries");
                System.out.println();
                System.out.println("How many frenchfries you want? : ");
                quantity = in.nextInt();
                total += quantity * frenchfries;
                break;

            case 2:
                System.out.println("You have selected in Burger");
                System.out.println();
                System.out.println("How many Burger you want? : ");
                quantity = in.nextInt();
                total += quantity * burger;
                break;

            case 3:
                System.out.println("You have selected in Pasta");
                System.out.println();
                System.out.println("How many pasta you want? : ");
                quantity = in.nextInt();
                total += quantity * pasta;
                break;

            case 4:
                System.out.println("You have selected in Pizza");
                System.out.println();
                System.out.println("How many Pizza you want? : ");
                quantity = in.nextInt();
                total += quantity * pizza;
                break;

            case 5:
                System.out.println("You have selected in ColdCoffee");
                System.out.println();
                System.out.println("How many ColdCoffee you want? : ");
                quantity = in.nextInt();
                total += quantity * coldCoffee;
                break;

            case 6:
                System.out.println("You have selected in IcedTea");
                System.out.println();
                System.out.println("How many IcedTea you want? : ");
                quantity = in.nextInt();
                total += quantity * icedTea;
                break;

            case 7:
                System.out.println("You have selected in Chicken Nuggets");
                System.out.println();
                System.out.println("How many Chicken nuggets you want? : ");
                quantity = in.nextInt();
                total += quantity * chickenNuggets;
                break;
            case 8:
                System.out.println("You have selected in Cold Drinks");
                System.out.println();
                System.out.println("How many Cold Drinks  you want? : ");
                quantity = in.nextInt();
                total += quantity * coldDrinks;
                break;

            case 9:
                System.exit(1);
                break;

            default:
                break;
        }
            System.out.println();
            System.out.println("Do you wush to order Anything else [Y/N] ");
            again=in.next();

            if(again.equalsIgnoreCase("Y")){
                order();
            }
            else if(again.equalsIgnoreCase("N")){
                generateBill();
                System.exit(1);
            }
            else {
                System.out.println("Invalid choice");
            }

        }
    }
}
