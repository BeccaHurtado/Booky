package booklog.example.Booky.models;

import lombok.Data;
import lombok.NoArgsConstructor;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("book")
@Data
public class Book {
    @Id
    private String id;
    private String bookName;
    private String bookAuthor;
    private String bookGenre;
    private String bookDesc;
    private String bookNotes;
    private String bookFavQuotes;

        public Book(String id, String bookName, String bookAuthor, String bookGenre, String bookDesc, String bookNotes, String bookFavQuotes) {
            super();
            this.id = id;
            this.bookName = bookName;
            this.bookAuthor = bookAuthor;
            this.bookGenre = bookGenre;
            this.bookDesc = bookDesc;
            this.bookNotes = bookNotes;
            this.bookFavQuotes = bookFavQuotes;
    }

    // book id
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }

    // book name
    public String getBookName() {
        return bookName;
    }
    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    // book author
    public String getBookAuthor() {
            return bookAuthor;
        }
    public void setBookAuthor(String bookAuthor) {
            this.bookAuthor = bookAuthor;
        }

    //book genre
    public String getBookGenre() {
            return bookGenre;
        }
    public void setBookGenre(String bookGenre) {
            this.bookGenre = bookGenre;
        }


    // book desc
    public String getBookDesc() {
        return bookDesc;
    }
    public void setBookDesc(String bookDesc) {
        this.bookDesc = bookDesc;
    }

    // book notes
    public String getBookNotes() {
        return bookNotes;
    }

    public void setBookNotes(String bookNotes) {
        this.bookNotes = bookNotes;
    }

    // book quotes
    public String getBookFavQuotes() {
            return bookFavQuotes;
    }
    public void setBookFavQuotes(String bookFavQuotes) {
            this.bookFavQuotes = bookFavQuotes;
    }
}
