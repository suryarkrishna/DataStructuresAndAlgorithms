package SetterInjection;
import java.util.Scanner;

public class Student {
    private int rollNo;
    private String name, br;
    private Contact c;

    // Constructor without parameters
    public Student() {
    }

    // Setter methods for Student properties
    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBr(String br) {
        this.br = br;
    }

    public void setContact(Contact c) {
        this.c = c;
    }

    public void getStudent() {
        System.out.println("====student details===");
        System.out.println("rollNo: "+rollNo + "\n" + "name: "+name + "\n" + "br: "+br + "\n" + "contact- "+c.getContact());
    }

    public static void main(String[] args) {
        Contact c = new Contact();
        Student s = new Student();
        
        // Set Student properties using setter methods
        s.setRollNo(1);
        s.setName("name");
        s.setBr("cde");
        s.setContact(c);

        Scanner sc = new Scanner(System.in);
        LoadStudent ls = new LoadStudent(s);
        ls.load(sc);
        DisplayStudent ds = new DisplayStudent(s);
        ds.display();
    }
}

class Contact {
    Student s;
    private String mailId;
    private Long phNo;
    public Contact() {

    }

    public Contact(String mailId, Long phNo){
        this.mailId = mailId;
        this.phNo = phNo;
    }

    public String getContact() {
        return "mailID: "+mailId + " phoneNo: " + phNo;
    }
}

class LoadStudent {
    private Student s;

    public LoadStudent(Student s) {
        this.s = s;
    }

    void load(Scanner sc) {
        System.out.println("roll Number: ");
        s.setRollNo(sc.nextInt());
        sc.nextLine(); // Consume the newline character
        System.out.println("name: ");
        s.setName(sc.nextLine());
        System.out.println("br: ");
        s.setBr(sc.nextLine());
        System.out.println("mail: ");
        String mailId = sc.nextLine();
        System.out.println("phone: ");
        Long phNo = sc.nextLong();

        s.setContact(new Contact(mailId, phNo));
    }
}

class DisplayStudent {
    private Student s;

    public DisplayStudent(Student s) {
        this.s = s;
    }

    void display() {
        s.getStudent();
    }
}
