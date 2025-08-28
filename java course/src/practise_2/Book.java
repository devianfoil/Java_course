package practise_2;

public class Book {
    String title;
    String author;

    Book(String title,String author){
        this.title = title;
        this.author = author;
    }

    public String getAuthor() {
        return this.author;
    }


    public String getTitle() {
        return this.title;
    }


    public void setAuthor(String author) {
        this.author = author;
    }


    public void setTitle(String author) {
        this.title = title;
    }

    public void printInfo() {
        System.out.println("Title:" + title + "Author:" + author);
    }
}
