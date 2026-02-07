import java.util.Scanner;
public class Main {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        StudentManager sm1 = new StudentManager();
        System.out.println("WELCOME TO MAIN MENU:");
        int n=0;
        do{
            System.out.println("1.Add Student");
            System.out.println("2.Show All Students");
            System.out.println("3.Exit");
            n = scanner.nextInt();
            if(n==1){
                scanner.nextLine();
                System.out.println("Enter Your Name:");
                String name = scanner.nextLine();
                System.out.println("Enter Your Roll-no:");
                int rollNo = scanner.nextInt();
                System.out.println("Enter Your GPA:");
                double gpa = scanner.nextDouble();
                sm1.addStudent(name,rollNo,gpa);
                System.out.println("Student Added Successfully.");
            }
            else if (n == 2) {
                System.out.println("Here You Go!");
                sm1.displayAllStudents();
            } else if (n == 3) {
                System.out.println("Exiting.....");
            }
            else {
                System.out.println("Invalid Command");
            }
        }while (n!=3);
    }
}
