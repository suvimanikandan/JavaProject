package Employeemanagement;


import java.util.Scanner;

public class Main {
    EmployeeService service=new EmployeeService();
    static boolean ordering=true;
    public static void menu() {
        System.out.println("**********************Welcome to employee management system ***************************"
                + "\n1.Add Employee"
                + "\n2.view Employee"
                + "\n3.update Employee"
                + "\n4.delete Employee"
                + "\n5.view all Employee"
                + "\n6.Exit");
    }
        public static void main(String[]args){
            Scanner in=new Scanner(System.in);
            EmployeeService service=new EmployeeService();

            do {
                menu();
                System.out.println("Enter your choice");
                int choice = in.nextInt();
                switch (choice) {
                    case 1:
                        System.out.println("Add employee");
                        service.addEmp();
                        break;
                    case 2:
                        System.out.println("View Employee");
                        service.viewEmp();
                        break;

                    case 3:
                        System.out.println("update employee");
                        service.updateEmp();
                        break;
                    case 4:
                        System.out.println("delete an employee");
                        service.deleteEmployee();
                        break;
                    case 5:
                        System.out.println("view all employee");
                        service.viewAllEmp();
                        break;
                    case 6:
                        System.out.println("Thank tou for using the Application");
                        System.exit(0);

                    default:
                        System.out.println("Please enter valid choice:");
                        break;
                }
            }while(ordering);


    }
}
