package by.epam.unit06.main.task03;

public class LibraryProgram {
    public static void main(String[] args) {
        Library library = new Library();
        library.add(new Book(1,"Hamlet", "Shakespeare", 2005, 100, "Eksmo", 100.58, "soft"));
        library.add(new Book(2,"Jane Eyre", "Charlotte Brontë", 1995, 250, "AST", 150.40, "hard"));


        System.out.println("Search books by author: Charlotte Brontë");
        System.out.println(library.findByAuthor("Charlotte Brontë"));
        System.out.println("Search books published after 1990");
        System.out.println(library.findByYear(1990));
    }
}
