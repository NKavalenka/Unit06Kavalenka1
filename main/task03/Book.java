package by.epam.unit06.main.task03;

public class Book {
    private int id;
    private String title;
    private String authors;
    private String publisher;
    private int year;
    private int pages;
    private double price;
    private String binding;

    public String toString() {
        return "[id=" + id + ", title=\"" + title + '\"' + ", authors=\"" + authors + '\"' + ", publisher=\"" + publisher + '\"' + ", year=" + year + ", pages=" + pages + ", price=" + price + ", type=\"" + binding + "\"]\n";
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthors() {
        return authors;
    }

    public void setAuthors(String authors) {
        this.authors = authors;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getBinding() {
        return binding;
    }

    public void setBinding(String binding) {
        this.binding = binding;
    }


    public Book(int id, String title, String authors, int year, int pages, String publisher, double price, String binding) {

        this.id = id;
        this.title = title;
        this.authors = authors;
        this.year = year;
        this.pages = pages;
        this.publisher = publisher;
        this.price = price;
        this.binding = binding;
    }
}
