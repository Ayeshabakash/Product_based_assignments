package Assign;

import java.util.Scanner;

class Book1 {
    String title;
    String author;
    int ISBN;
 Book1() {
        this.title = "Default Title";
        this.author = "Default Author";
        this.ISBN = 111111;
    }
 void addBook() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Book name: ");
        this.title = sc.nextLine();
        System.out.println("Enter Author name: ");
        this.author = sc.nextLine();
        System.out.println("Enter ISBN: ");
        this.ISBN = sc.nextInt();
    }
void displayBook() {
        System.out.printf("Title: %s\nAuthor: %s\nISBN: %d\n", this.title, this.author, this.ISBN);
    }
}

public class Book {
    public static void main(String[] args) {
    Book1 b1 = new Book1();
        
        b1.addBook();
        
        System.out.println("Updated Book Details:");
        b1.displayBook();
    }
}