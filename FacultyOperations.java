package pack.faculty;
import pack.faculty.FacultyDetails;
import java.util.Scanner;

class InvalidAgeException extends Exception
{
    InvalidAgeException(String s)
    {
    super(s);
    }
}

public class FacultyOperations extends FacultyDetails
{
    public FacultyOperations(){
        
    }
    public FacultyOperations(int id, String name, int age, String gender, long salary, String subject) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.salary = salary;
        this.subject = subject;
    }
    public void age_validate(float i) throws InvalidAgeException
	{
        if(i<0 || i>70) throw new InvalidAgeException("ENTERED AGE IS INVALID. PLEASE ENTER AGE AGAIN!!");
    }
    public String add()
    {
        System.out.println("\n---- Enter Faculty Information ----");
        System.out.print("ID: ");
        this.id = sc.nextInt();
        sc.nextLine();
        System.out.print("Name: ");
        this.name = sc.nextLine();
        while(!StringValidation(name)) 
        {
            System.out.println("You entered non aphabetic values in name. Please enter name again: ");
            this.name = sc.nextLine();
        }
        System.out.print("Age: ");
        this.age = sc.nextInt();
        try
        {
            age_validate(age);
        }
        catch(Exception e)
        {
            System.out.println(e);
            this.age = sc.nextInt();
        }
        sc.nextLine();
        System.out.print("Gender(Male/Female): ");
        this.gender = sc.nextLine();
        while(!(gender.equalsIgnoreCase("male") || gender.equalsIgnoreCase("female")))  
        {
            System.out.println("You entered wrong inputs. Please enter gender again: ");
            this.gender = sc.nextLine();
        }
        System.out.print("Salary: ");
        this.salary = sc.nextLong();
        sc.nextLine();
        System.out.println("Enter Subject faculty teach:");
        this.subject = sc.nextLine();
        while(!StringValidation(subject)) 
        {
            System.out.println("You entered non aphabetic values in subject. Please enter subject again: ");
            this.subject = sc.nextLine();
        }
        FacultyOperations o=new FacultyOperations(id, name, age, gender, salary, subject);
        System.out.println("\n-----///----- New Faculty added -----///-----");
		String result=facultyToStr();
		return result;    
	}
    public void showDetails() {
        System.out.println("\n-----//-----//-----");
        System.out.println("Id: " + id);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Gender: " + gender);
        System.out.println("Salary: " + salary);
        System.out.println("Subject: " + subject);
    }
    public String update(int id)
    {
        System.out.println("\n---- Edit Faculty Information ----");
        System.out.println("Enter faculty ID:");
        this.id=sc.nextInt();
        sc.nextLine();
        System.out.print("Enter Name: ");
        this.name = sc.next();
        while(!StringValidation(name)) 
        {
            System.out.println("You entered non aphabetic values in name. Please enter name again: ");
            this.name = sc.nextLine();
        }
        System.out.print("Enter Age:");
        this.age = sc.nextInt();
        try
        {
            age_validate(age);
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        System.out.print("Enter Gender:");
        this.gender = sc.nextLine();
        while(!(gender.equalsIgnoreCase("male") || gender.equalsIgnoreCase("female")))  
        {
            System.out.println("You entered wrong inputs. Please enter gender again: ");
            this.gender = sc.nextLine();
        }
        System.out.print("Enter salary:");
        this.salary = sc.nextLong();
        sc.nextLine();
        System.out.println("Enter subject faculty teach: ");
        this.subject = sc.nextLine();
        while(!StringValidation(subject)) 
        {
            System.out.println("You entered non aphabetic values in subject. Please enter subject again: ");
            this.subject = sc.nextLine();
        }
        System.out.println("\n-----///----- Faculty data updated -----///-----");
        showDetails();
        String result=facultyToStr();
        return result;  
    }
    
    public String delete(int Id)
    {
        if(Id <= 0) {
            System.out.println("///=== No faculty found with this ID ===///");
            return "";
        } 
        else {
            Id=0;
            System.out.println("\n-----///----- Faculty deleted -----///-----");
            return null;
        }
    }
	public String facultyToStr() {
        return id  + " " + name + " " + age  + " " + gender + "  " + salary + " " + subject;
    }
    public boolean StringValidation(String str)
    {
        str = str.toLowerCase();
        char[] ch = str.toCharArray();
        for (int i = 0; i < ch.length; i++) {
            char c = ch[i];
            if (c<'a' || c>'z') {
                return false;
            }
        }
        return true;
    }
}