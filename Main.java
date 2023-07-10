import pack.faculty.FacultyDetails;
import pack.faculty.FacultyOperations;
import pack.services.Services;
import pack.student.StudentDetails;
import pack.student.StudentOperations;
import java.util.Scanner;

class Main 
{
    static int i = 0, l = 0;
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String ob[] = new String[10000];
    String obF[] = new String[10000];
    while (true) {
        System.out.print("\033[H\033[2J");
        System.out.flush();
        System.out.println("\n\n\n\t\t****WELCOME TO NIRMA UNIVERSITY****\n\n");
        System.out.println("\n\n\n\t\tTHIS IS UNIVERSITY MANAGEMENT SYSTEM\n\n");
        System.out.println("\tEnter 1 to log into student portal:");
        System.out.println("\tEnter 2 to log into faculty portal:");
        System.out.println("\tEnter 3 to log into services:");
        System.out.println("\tEnter 4 to exit application:");
        System.out.print("\t\t");
        char x = sc.next().charAt(0);
        if (x == '1') {
            System.out.print("\033[H\033[2J");
            System.out.flush();
            char option;
        do {
            System.out.println("\n----- Manage Students -----");
            System.out.println("1. Add Student");
            System.out.println("2. Update Student");
            System.out.println("3. Delete Student");
            System.out.println("4. Show All Students");
            System.out.println("5. Exit");
            System.out.print("\nSelect Option: ");
            option = sc.next().charAt(0);
            switch (option) 
            {
                case '1':
                StudentOperations o = new StudentOperations();
                ob[i] = new String();
                ob[i] = o.add();
                i++;
                break;
                case '2':
                System.out.print("\nEnter student ID to update: ");
                Integer studentId = sc.nextInt();
                int flag = 0;
                for (int j = 0; j < i; j++) {
                    StudentOperations o1 = new StudentOperations();
                    String s = studentId.toString();
                    if (ob[j].startsWith(s)) {
                    flag=1;
                    ob[j] = o1.update(studentId);
                    }
                }
                if(flag == 0) System.out.println("Student not found!!");
                break;
                case '3':
                System.out.print("\nEnter student ID to delete: ");
                Integer Id = sc.nextInt();
                StudentOperations oS1 = new StudentOperations();
                String s = Id.toString();
                int k=0;
                for (int j = 0; j < i; j++) {
                    if (ob[j].startsWith(s)) {
                    ob[j] = oS1.delete(Id);
                    k=1;
                    i--;
                    }
                    if(k==1) ob[j] = ob[j + 1];
                }
                if(k==0) System.out.println("Student not found!!");
                break;
                case '4':
                if(i==0) System.out.println("There are no Students.");
                for (int j = 0; j < i; j++) System.out.println(ob[j] + " ");
                break;
                case '5':
                System.out.print("\033[H\033[2J");
                System.out.flush();
                System.out.println("Student Portal Exited");
                break;
                default:
                System.out.println("Invalid Input");
            }
            } while (option != '5');
        } else if (x == '2') {
            System.out.print("\033[H\033[2J");
            System.out.flush();
            char option;
            do {
            System.out.println("\n----- Manage Faculties -----");
            System.out.println("1. Add Faculty");
            System.out.println("2. Update Faculty");
            System.out.println("3. Delete Faculty");
            System.out.println("4. Show All Faculties");
            System.out.println("5. Exit");
            System.out.print("\nSelect Option: ");
            option = sc.next().charAt(0);
            switch (option) {
                case '1':
                FacultyOperations oF = new FacultyOperations();
                obF[l] = new String();
                obF[l] = oF.add();
                l++;
                break;
                case '2':
                System.out.print("\nEnter faculty ID to update: ");
                Integer facultyId = sc.nextInt();
                int flag = 0;
                for (int j = 0; j < l; j++) {
                    FacultyOperations of1 = new FacultyOperations();
                    String s = facultyId.toString();
                    if (obF[j].startsWith(s)) {
                        flag=1;
                        obF[j] = of1.update(facultyId);
                    }
                }
                if(flag == 0) System.out.println("Faculty not found!!");
                break;
                case '3':
                System.out.print("\nEnter faculty ID to delete: ");
                Integer Id = sc.nextInt();
                FacultyOperations oF1 = new FacultyOperations();
                String s = Id.toString();
                int k=0;
                for (int j = 0; j < l; j++) {
                    if (obF[j].startsWith(s)) {
                        k=1;
                        obF[j] = oF1.delete(Id);
                        l--;
                    }
                    if(k == 1) obF[j] = obF[j+1];
                }
                if(k == 0) System.out.println("Faculty not found!!");
                break;
                case '4':
                if(i==0) System.out.println("There are no Faculties.");
                for (int j = 0; j < l; j++) System.out.println(obF[j] + " ");
                break;
                case '5':
                System.out.println("Faculty Portal Exited");
                break;
                default:
                System.out.println("Invalid Input");
            }
            } while (option != '5');
        } else if (x == '3') {
        System.out.print("\033[H\033[2J");
        System.out.flush();
        char option;
        do {
            System.out.println("\n----- Services Provided -----");
            System.out.println("1. Transportation:");
            System.out.println("2. Library:");
            System.out.println("3. Exit");
            System.out.print("\nSelect Option: ");
            option = sc.next().charAt(0);
            Services s = new Services();
            switch (option) {
                case '1':
                Services.Transportation t = s.new Transportation();
                t.transport();
                break;
                case '2':
                Services.Library l = s.new Library();
                l.library();
                break;
                case '3':
                System.out.println("Service Portal Exited");
                break;
                default:
                System.out.println("Invalid Input");
            }
            } while (option != '3');
        } else if (x == '4') {
            return;
        } else {
            System.out.println("ENTER VALID NUMBER");
        }
        System.out.println("\n\n\n\t\tENTER 0 to exit Application and 1 to Continue");
        char a = sc.next().charAt(0);
        if (a == '0') break;
        }
    }
}