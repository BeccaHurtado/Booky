package booklog.example.Booky.models;

import nonapi.io.github.classgraph.json.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "books")
public class Books {
    @Id
    String id;
    String bookName;
    String bookDesc;
    String bookNotes;

    public Books() {
    }
        public Books(String bookName, String bookDesc, String bookNotes) {
            super();
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
