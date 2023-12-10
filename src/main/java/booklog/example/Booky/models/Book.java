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
    private String bookDesc;
    private String bookNotes;

        public Book(String id, String bookName, String bookDesc, String bookNotes) {
            super();
            this.id = id;
            this.bookName = bookName;
            this.bookDesc = bookDesc;
            this.bookNotes = bookNotes;
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

    public void setBookName(String brookName) {
        this.bookName = bookName;
    }

    // book desc
    public String getBookDesc() {
        return bookDesc;
    }

    public void setBookDesc() {
        this.bookDesc = bookDesc;
    }

    // book notes
    public String getBookNotes() {
        return bookNotes;
    }

    public void setBookNotes() {
        this.bookNotes = bookNotes;
    }
}
