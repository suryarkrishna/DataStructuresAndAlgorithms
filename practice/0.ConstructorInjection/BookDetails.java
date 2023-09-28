import java.util.Scanner;

public class BookDetails {
    String code;
    String name;
    String author;
    float price;

    public void getBookDetails() {
        // DisplayBookDetails dbd = new DisplayBookDetails(this);
        // dbd.display(this);
        System.out.println("====Book Details===");
         System.out.println(code + "\n " + name + " \n" + author + " \n" + price);
    }

    public static void main(String[] args) {
        BookDetails bd = new BookDetails();
        LoadBookDetails lbd = new LoadBookDetails(bd);
        DisplayBookDetails dbd = new DisplayBookDetails(bd);
       Scanner s = new Scanner(System.in);
        lbd.load(s);
        dbd.display();
        

    }

}

class LoadBookDetails {

    BookDetails bd;

    public LoadBookDetails(BookDetails bd) {
        // Scanner s = new Scanner(System.in);
        // load(s);
        this.bd = bd;
    }

    void load(Scanner s) {
        bd.code = s.nextLine();
        bd.name = s.nextLine();
        bd.author = s.nextLine();
        bd.price = s.nextFloat();

    }

    public static void main(String[] args) {
        BookDetails bd = new BookDetails();
        LoadBookDetails lbd = new LoadBookDetails(bd);
    }
}

class DisplayBookDetails {
    BookDetails bd;

    public DisplayBookDetails(BookDetails bd) {
        this.bd = bd;
    }

    void display() {
        bd.getBookDetails();

    }

    public static void main(String[] args) {
        BookDetails bd = new BookDetails();
        DisplayBookDetails dbd = new DisplayBookDetails(bd);
    }
}
