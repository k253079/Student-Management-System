import java.util.ArrayList;

public class StudentManager {

    private ArrayList<Student> students;
    public StudentManager(){
        students = new ArrayList<>();
    }
    void addStudent(String name, int rollNo , double gpa){
        Student s = new Student(name,rollNo,gpa);
        students.add(s);
    }
    void displayAllStudents() {
        if (students.size() == 0) {
            System.out.println("No students found");
        } else {
            for (Student a : students) {
                a.displayInfo();
            }
        }
    }
}

