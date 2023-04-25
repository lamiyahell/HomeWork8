public class Book {
    private String author;
    private String bookName;
    private int publishingYear;


    public Book(String author, String bookName, int publishingYear) {
        this.author = author;
        this.bookName = bookName;
        this.publishingYear = publishingYear;
    }

    public String getAuthor() {
        return author;
    }

    public String getBookName() {
        return this.bookName;
    }

    public int getPublishingYear() {
        return this.publishingYear;
    }

    public void setPublishingYear(int publishingYear) {
        this.publishingYear = publishingYear;
    }
}
