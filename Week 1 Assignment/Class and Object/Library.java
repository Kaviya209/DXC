package dxc;
import java.util.Scanner;
public class Library {

	     private int accNum;
	    private String title;
	    private String author;
	    
	    void input() {
	        Scanner in = new Scanner(System.in);
	        System.out.print("Enter book title: ");
	        title = in.nextLine();
	        System.out.print("Enter author: ");
	        author = in.nextLine();
	        System.out.print("Enter accession number: ");
	        accNum = in.nextInt();
	    }
	    
	    void compute() {
	        Scanner in = new Scanner(System.in);
	        System.out.print("Enter number of days late: ");
	        int days = in.nextInt();
	        int fine = days * 2;
	        System.out.println("Fine = Rs." + fine);
	    }
	    
	    void display() {
	        System.out.println("Accession Number\tTitle\tAuthor");
	        System.out.println(accNum + "\t\t" + title + "\t" + author);
	    }
	    
	    public static void main(String args[]) {
	        Library obj = new Library();
	        obj.input();
	        obj.display();
	        obj.compute();
	    }

}

