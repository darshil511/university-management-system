package pack.services;
import java.util.Scanner;

public class Services
{
    public class Transportation
    {
        Scanner sc = new Scanner(System.in);
        public void enter()
        {
            String name, address;
            int id;
            sc.nextLine();
            System.out.print("Enter your name: ");
            name = sc.nextLine();
            while(!StringValidation(name)) 
            {
                System.out.println("You entered non aphabetic values in name. Please enter name again: ");
                name = sc.nextLine();
            }
            System.out.print("Enter your id: ");
            id = sc.nextInt();
            sc.nextLine();
            System.out.print("Enter pickup point: ");
            address = sc.nextLine();

            System.out.println("YOUR TRANSPORTATION SERVICES HAS BEEN AVAILED.\nKINDLY PAY YOUR TRANSPORTATION FEES WITHTIN 3 DAYS!!");
        }
        public void transport(){
            System.out.println("\n\n\t\t\tWELCOME TO TRANSPORTATION SERVICE BY UNIVERSITY\n\n");
            System.out.println("Transportation facilities include: ");
            System.out.println("The university operates a fleet of buses that ply in almost all the areas in Ahmedabad and Gandhinagar. The transportation facility is available for students, faculty, and staff members. In addition, there are seven Sumos and twelve cars available to the faculty members for movement within the campus or for any official work.\n The university has an ambulance to cater to any medical emergency on campus. It also owns a tractor to facilitate the movement of goods and waste materials from one place to another.\n");
            System.out.println("Contact \nEmail: transport@uni.ac.in\n\n");
            
            System.out.print("Do you want to avail our Transportation facilities? (1 for YES /0 for NO): ");
            int f = sc.nextInt();
            if(f==1)
            {
                enter();
            }
            else {
                System.out.println("THANK YOU FOR VISITING TRANSPORTATION PORTAL");
            }
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

    public class Library
    {
        Scanner sc = new Scanner(System.in);
        public void enter()
        {
            String name, book;
            int id;
            sc.nextLine();
            System.out.print("Enter your name: ");
            name = sc.nextLine();
            while(!StringValidation(name)) 
            {
                System.out.println("You entered non aphabetic values in name. Please enter name again: ");
                name = sc.nextLine();
            }
            System.out.print("Enter your id: ");
            id = sc.nextInt();
            System.out.print("Enter Book Name: ");
            book = sc.nextLine();

            System.out.println("YOUR BOOK HAS BEEN ISSUED.\nKINDLY RETURN IT WITHTIN 14 DAYS!!");
        }

        public void library() {
            System.out.println("\n\n\t\t\tWELCOME TO LIBRARY SERVICE BY UNIVERSITY\n\n");
            System.out.println("The Library acts as a key resource and learning center of the University to meet the information needs of more than 5,000 users. \nIt plays a vital role in enhancing the academic and research growth and overall development of the University.\n");
            System.out.println("The library organizes other activities like Screening TED talks, book review, celebration of National and International Days, training of Zotero and Mendeley (Reference Management Software) to users etc.\n");
            System.out.println("Contact \nEmail: library@uni.ac.in\n\n");

            System.out.print("Do you want to avail our Library facilities? (1 for YES /0 for NO): ");
            int f = sc.nextInt();
            if(f==1)
            {
                enter();
            }
            else {
                System.out.println("THANK YOU FOR VISITING LIBRARY PORTAL");
            }
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
}