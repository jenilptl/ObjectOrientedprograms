class Book {
    private String author_name;

    Book(String author) {
        this.author_name = author;
    }

    String getAuthorName() {
        return author_name;
    }

    void display() {
        System.out.println("Author: " + author_name);
    }
}

class BookPublication extends Book {
    private String title;

    BookPublication(String author, String title) {
        super(author);
        this.title = title;
    }

    void display() {
        System.out.println("Book Title: " + title + ", Author: " + getAuthorName());
    }
}

class PaperPublication extends Book {
    private  String title;

    PaperPublication(String author, String title) {
        super(author);
        this.title = title;
    }

    void display() {
        System.out.println("Paper Title: " + title + ", Author: " + getAuthorName());
    }
}

public class PublicationDemo {
    public static void main(String[] args) {
        Book b;
        b = new BookPublication("John Doe", "Java Basics");
        b.display();

        b = new PaperPublication("John Doe", "AI Research");
        b.display();
    }
}
