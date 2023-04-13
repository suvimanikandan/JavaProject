package Employeemanagement;

import java.util.HashSet;
import java.util.Scanner;

public class EmployeeService {
    HashSet<Employee> empset = new HashSet<Employee>();
    Employee emp1 = new Employee(101, "Swetha", 21, "Developer", "CS", 40000);
    Employee emp2 = new Employee(102, "Thangamani", 22, "Linux Developer", "CS", 46000);
    Employee emp3 = new Employee(103, "Malar", 20, "Testing", "IT", 30000);
    Employee emp4 = new Employee(104, "Sanvika", 21, "Aws Devloper", "CS", 20000);
    Employee emp5 = new Employee(105, "Girija", 20, "Voiceprocess", "NONIT", 30000);

    Scanner in = new Scanner(System.in);
    boolean found = false;
    int id;
    String name;
    int age;
    String dept;
    String designation;
    double salary;

    public EmployeeService() {
        empset.add(emp1);
        empset.add(emp2);
        empset.add(emp3);
        empset.add(emp4);
        empset.add(emp5);
    }

    //view all employees
    public void viewAllEmp() {
        for (Employee emp : empset) {
            System.out.println(emp);
        }
    }

    //view emp based on ther id:
    public void viewEmp() {
        System.out.println("Enter id: ");
        id = in.nextInt();
        for (Employee emp : empset) {
            if (emp.getId() == id) {
                System.out.println(emp);
                found = true;
            }
            if (!found) {
                System.out.println("Employee with this id is not present");
            }

        }
    }
        //update the all employee
        public void updateEmp() {
            System.out.println("Enter id: ");
            id = in.nextInt();
            boolean found = false;
            for (Employee emp : empset) {
                if (emp.getId() == id) {
                    System.out.println("Enter name: ");
                    name = in.next();
                    System.out.println("Enter new salary: ");
                    salary = in.nextDouble();
                    emp.setName(name);
                    emp.setSalary(salary);
                    System.out.println("Updated details of employee are: ");
                    System.out.println(emp);
                    found = true;
                }

            }
            if (!found) {
                System.out.println("Employee is not present");
            } else {
                System.out.println("Employee details updated successfully!!");
            }
        }


        //delete emp
        public void deleteEmployee() {
            System.out.println("Enter id: ");
            id = in.nextInt();
            boolean found = false;
            Employee empdelete = null;
            for (Employee emp : empset) {
                if (emp.getId() == id) {
                    empdelete = emp;
                    found = true;
                }
            }
            if (!found) {
                System.out.println("Employee is not present");
            } else {
                empset.remove(empdelete);
                System.out.println("Employee deleted successfully!!");
            }
        }
        //add emp


    public void addEmp() {
        System.out.println("Enter id: ");
        id=in.nextInt();
        System.out.println("Enter name: ");
        name=in.next();
        System.out.println("Enter age: ");
        age= in.nextInt();
        System.out.println("Enter designation : ");
        designation=in.next();
        System.out.println("Enter dept: ");
        dept=in.next();
        System.out.println("Enter salary; ");
        salary=in.nextDouble();

        Employee emp=new Employee(id,name,age,designation,dept,salary);
        empset.add(emp);
        System.out.println(emp);
        System.out.println("Employee added Successfully!!");

    }
}
