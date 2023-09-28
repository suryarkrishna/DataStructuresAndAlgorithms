import java.util.Scanner;

public class Student {
    int rollNo;
    String name, br;
    Contact c;

    public Student(int rollNo, String name, String br, Contact c) {
        this.rollNo = rollNo;
        this.name = name;
        this.br = br;
        this.c = c;
    }

    public void getStudent() {
        System.out.println("====student details===");
        System.out.println("rollNo: "+rollNo + "\n" + "name: "+name + "\n" + "br: "+br + "\n" + "contact- "+c.getContact());
    }

    public static void main(String[] args) {
        Contact c = new Contact("abd@gmail.com", 98548745415L);
        Student s = new Student(1, "name", "cde", c);
        Scanner sc = new Scanner(System.in);
        LoadStudent ls = new LoadStudent(s);
        ls.load(sc);
        DisplayStudent ds = new DisplayStudent(s);
        ds.display();
    }
}

class Contact {
    String mailId;
    Long phNo;

    public Contact(String mailId, Long phNo) {
        this.mailId = mailId;
        this.phNo = phNo;
    }

    public String getContact() {
        return "mailID: "+mailId + " phoneNo: " + phNo;
    }
}

class LoadStudent {
    Student s;

    public LoadStudent(Student s) {
        this.s = s;
    }

    void load(Scanner sc) {
        System.out.println("roll Number: ");
        s.rollNo = sc.nextInt();
        sc.nextLine(); // Consume the newline character
        System.out.println("name: ");
        s.name = sc.nextLine();
        System.out.println("br: ");
        s.br = sc.nextLine();
        System.out.println("mail: ");
        String mailId = sc.nextLine();
        System.out.println("phone: ");
        Long phNo = sc.nextLong();
        s.c = new Contact(mailId, phNo);
    }
}

class DisplayStudent {
    Student s;

    public DisplayStudent(Student s) {
        this.s = s;
    }

    void display() {
        s.getStudent();
    }
}
