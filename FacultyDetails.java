package pack.faculty;
import java.util.Scanner;

abstract class details
{
	abstract public String add();
	abstract public String update(int id);
	abstract public String delete(int facultyId);
	public abstract boolean StringValidation(String str);
}

public abstract class FacultyDetails extends details {
    int id;
    String name;
    int age;
    String gender;
    long salary;
	String subject;
    Scanner sc = new Scanner(System.in);
    public FacultyDetails() {
    }
    public FacultyDetails(int id, String name, int age, String gender, long salary, String subject) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.salary = salary;
        this.subject=subject;
    }
	public abstract String add();
	public abstract String update(int id);
	public abstract String delete(int id);
    public abstract boolean StringValidation(String str);
}