import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    private static GroceryList groceryList = new GroceryList();

    public static void main(String[] args) {
        boolean quit = false;
        int choice = 0;
        printInstructions();      //we'll make this method in some time

        while (!quit) {
            System.out.println("enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 0:
                    printInstructions();
                    break;
                case 1:
                    groceryList.printGroceryList();
                    break;
                case 2:
                    addItem();
                    break;
                case 3:
                    modifyItems();
                    break;
                case 4:
                    removeItems();
                    break;
                case 5:
                    searchforitem();
                    break;
                case 6:
                    quit=true;
                    break;


            }
        }


    }

    public static void printInstructions() {
        System.out.println("\n Press");
        System.out.println("\t 0 -to print choice options");
        System.out.println("\t 1- to print the list of grocery items");
        System.out.println("\t 2- to add an item of the list");
        System.out.println("\t 3- to modify an item of the list");
        System.out.println("\t 4- to remove an item of the list");
        System.out.println("\t 5- to search for the item of an list");
        System.out.println("\t 6- to quit the applications");
    }

    public static void addItem() {
        System.out.println("Please enter the grocery item: ");
        groceryList.addGroceryItem(scanner.nextLine());
    }

    public static void modifyItems() {
        System.out.println("Enter item number: ");
        int itemno = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Enter replacement item: ");
        String newItem = scanner.nextLine();
        groceryList.modifyGroceryList(itemno - 1, newItem);
    }

    public static void removeItems() {
        System.out.println("Enter item number: ");
        int itemno = scanner.nextInt();
        scanner.nextLine();
        groceryList.removeGroceryitem(itemno - 1);

    }
    public static void searchforitem(){
        System.out.println("item to search for: ");
        String searchItem=scanner.nextLine();

        if(groceryList.findItem(searchItem)!=null){
            System.out.println("found "+searchItem+ "In the grocery list");
        }
        else{
            System.out.println("not found "+searchItem+ " in the grocery list");
        }
    }
}
