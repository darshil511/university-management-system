package pack.student;
import java.util.Scanner;

interface details
{
	String add();
	String update(int id);
	String delete(int studentId);
    boolean StringValidation(String str);
}

public abstract class StudentDetails implements details {
    int id;
    String name;
    int age;
    String gender;
    double cgpa;
    Scanner sc = new Scanner(System.in);
    public StudentDetails() {
    }
    public StudentDetails(int id, String name, int age, String gender, double cgpa) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.cgpa = cgpa;
    }
    abstract public String add();
	abstract public String update(int id);
	abstract public String delete(int studentId);
    abstract public boolean StringValidation(String str);
}