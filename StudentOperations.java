package pack.student;
import pack.student.StudentDetails;
import java.util.Scanner;

class InvalidAgeException extends Exception
{
    InvalidAgeException(String s)
    {
        super(s);
    }
}

class InvalidCgpaException extends Exception
{
    InvalidCgpaException(String s)
    {
        super(s);
    }
}


public class StudentOperations extends StudentDetails
{
    public StudentOperations(){
        
    }
    public StudentOperations(int id, String name, int age, String gender, double cgpa) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.cgpa = cgpa;
    }
    public void age_validate(float i) throws InvalidAgeException
	{
        if(i<0f || i>40f) throw new InvalidAgeException("ENTERED AGE IS INVALID. PLEASE ENTER AGE AGAIN!!");
    }

    public void cgpa_validate(double i) throws InvalidCgpaException
	{
        if(i<0.0 || i>10.0) throw new InvalidCgpaException("ENTERED CGPA IS INVALID. PLEASE ENTER CGPA AGAIN!!");
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
    public String add()
    {
        System.out.println("\n---- Enter Student Information ----");
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
        System.out.print("Cgpa: ");
        this.cgpa = sc.nextDouble();
        try
        {
            cgpa_validate(cgpa);
        }
        catch(Exception e)
        {
            System.out.println(e);
            this.cgpa = sc.nextDouble();
        }
        StudentOperations o=new StudentOperations(id, name, age, gender, cgpa);
        System.out.println("\n-----///----- New student added -----///-----");
		String result=studentToStr();
		return result;    
	}
    public void showDetails() {
        System.out.println("\n-----//-----//-----");
        System.out.println("Id: " + id);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Gender: " + gender);
        System.out.println("CGPA: " + cgpa);
    }
    public String update(int id)
    {
        System.out.println("\n---- Edit Student Information ----");
        System.out.println("Enter student ID:");
        this.id=sc.nextInt();
        sc.nextLine();
        System.out.print("Enter Name: ");
        this.name = sc.nextLine();
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
            this.age = sc.nextInt();
        }
        sc.nextLine();
        System.out.print("Enter Gender:");
        this.gender = sc.nextLine();
        while(!(gender.equalsIgnoreCase("male") || gender.equalsIgnoreCase("female")))  
        {
            System.out.println("You entered wrong inputs. Please enter gender again: ");
            this.gender = sc.nextLine();
        }
        System.out.print("Enter Cgpa:");
        this.cgpa = sc.nextDouble();
        
        try
        {
            cgpa_validate(cgpa);
        }
        catch(Exception e)
        {
            System.out.println(e);
            this.cgpa = sc.nextDouble();
        }
        System.out.println("\n-----///----- Student data updated -----///-----");
        showDetails();
        String result=studentToStr();
        return result;  
    }
    
    public String delete(int studentId)
    {
        if(studentId == 0) {
            System.out.println("///=== No student found with this ID ===///");
        } 
        else {
            studentId=0;
            System.out.println("\n-----///----- Student deleted -----///-----");
        }
        return null;
    }
	public String studentToStr() {
        return id + " " + name + " " + age + " " + gender + " " + cgpa;
    }
}