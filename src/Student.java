public class Student {
    private String name;
    private int rollNo;
    private double gpa;

    public Student(String name, int rollNo,double gpa){
        this.name=name;
        this.rollNo = rollNo;
        this.gpa = gpa;

    }
    public void displayInfo(){
        System.out.println("----------------------------");
        System.out.println("Student name:" + name);
        System.out.println("Student rollNo:" + rollNo);
        System.out.println("Student gpa:" + gpa);
        System.out.println("----------------------------");
    }
    String getName(){
        return name;
    }
    int getRollNo(){
        return rollNo;
    }
    double getGpa(){
        return gpa;
    }
    void setName(String name){
        this.name =name;
    }
    void setRollNo(int rollNo){
        this.rollNo = rollNo;
    }
    void setGpa(double gpa){
        this.gpa = gpa;
    }
}
