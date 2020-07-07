/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project_6_10;

import java.util.Scanner;

/**
 *
 * @author KHUSHWANT SINGH
 */
public class Project_6_10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        MyDate dt=new MyDate();
        System.out.println("Today's Date: "+dt.getDay()+" "+dt.getMonth()+" "+dt.getYear());
        // TODO code application logic here
        String name, address, email, phone;
        int  office, salary;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter 1 for Employee: \nEnter 2 for Students: ");
        int choice=sc.nextInt();
        switch (choice){
            case 1:
                System.out.print("Enter employee Name: ");
                sc.nextLine();
                name=(String)sc.nextLine();
                System.out.print("Enter address: ");
                address=(String)sc.nextLine();
                System.out.print("Enter email id: ");
                email=(String)sc.nextLine();
                System.out.print("Enter phone number: ");
                phone=(String)sc.nextLine();
                System.out.print("Enter office address(as Integer): ");
                office=sc.nextInt();
                System.out.print("Enter salary of(as Integer): ");
                salary=sc.nextInt();
                Employee employee = new Employee(name, address, phone, email, office, salary);
                System.out.println(employee.toString());
                
                System.out.print("\nEnter 1 to select employee as FACULTY: ");
                System.out.print("\nEnter 2 to select employee as STAFF: ");
                int emp=sc.nextInt();
                switch(emp){
                    case 1:
                        System.out.print("\nEnter office hours of Faculty: ");
                        sc.nextLine();
                        String officeHours=sc.nextLine();
                        System.out.print("Enter rank of Faculty (ex-Professor, Teacher): ");
                        String rank=sc.nextLine();
                        Faculty faculty = new Faculty(name, address, phone, email, office, salary, officeHours, rank);
                        
                        System.out.print("\nEnter 1 to search faculty: ");
                        System.out.print("\nEnter 2 to delete faculty: ");
                        int fac=sc.nextInt();
                        switch(fac){
                            case 1:    System.out.println(faculty.toString());
                                break;
                            case 2: faculty=null;
                                System.out.println(faculty);
                                System.out.println("Record Deleted Successfully!!!");
                                break;
                            default: System.exit(0);
                                break;
                            }
                    break;
                    case 2:
                        System.out.print("\nEnter title of Staff member (ex-Executive Assistant): ");
                        sc.nextLine();
                        String title=sc.nextLine();
                        Staff staff = new Staff(name, address, phone, email, office, salary, title);
                        System.out.print("Enter 1 to search staff member: ");
                        System.out.print("\nEnter 2 to delete staf member: ");
                        int stf=sc.nextInt();
                        switch(stf){
                            case 1:    System.out.println(staff.toString());
                                break;
                            case 2: staff=null;
                                System.out.println(staff);
                                System.out.println("Record Deleted Successfully!!!");
                                break;
                            default: System.exit(0);
                                break;
                            }
                    break;
                }
                break;
        case 2:
                System.out.print("Enter student Name: ");
                sc.nextLine();
                name=sc.nextLine();
                System.out.print("Enter address: ");
                address=(String)sc.nextLine();
                System.out.print("Enter email id: ");
                email=(String)sc.nextLine();
                System.out.print("Enter phone number: ");
                phone=(String)sc.nextLine();
                System.out.print("Enter office address (as Integer): ");
                office=sc.nextInt();
                Student student = new Student(name, address, phone, email, Student.FRESHMAN);
                Person person = new Person(name, address, phone, email);
		System.out.println(person.toString());
                
                System.out.print("\nEnter 1 to search student: ");
                System.out.print("\nEnter 2 to delete student: ");
                int stu=sc.nextInt();
                switch(stu){
                    case 1:    System.out.println(student.toString());
                        break;
                    case 2: student=null;
                        System.out.println(student);
                        System.out.println("Record Deleted Successfully!!!");
                        break;
                    default: System.exit(0);
                }
                break;
        }
    }
}
