package by.epam.unit06.main.task03;

import java.util.ArrayList;

public class Library {
    private ArrayList<Book> library;

    public Library() {
        library = new ArrayList<Book>();
    }

    public void add(Book book) {
        library.add(book);
    }

    public String findByAuthor(String a) {
        StringBuffer buffer = new StringBuffer("");
        library.forEach(book -> {
            if (book.getAuthors() == a)
                buffer.append(book.toString());
        });
        return buffer.toString();
    }

    public String findByYear(int y) {
        StringBuffer buffer = new StringBuffer("");
        library.forEach(book -> {
            if (book.getYear() > y)
                buffer.append(book.toString());
        });
        return buffer.toString();
    }

}
