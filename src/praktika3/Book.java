import java.time.Year;

public class Book {
    private String author,bookname;
    int year;
    public void Svoistva1(String author,String bookname,int year){
        System.out.println(author);
        System.out.println(bookname);
        System.out.println(year);
    }

    public void setAuthor(String author) {
        this.author = author;
    }
    public String getAuthor(){
        return author;
    }

    public void setBookname(String bookname) {
        this.bookname = bookname;
    }

    public String getBookname() {
        return bookname;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getYear() {
        return year;
    }
}
