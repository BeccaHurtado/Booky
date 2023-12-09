package booklog.example.Booky.repos;

import booklog.example.Booky.models.Books;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface BookRepository  extends MongoRepository<Books, String> {

    @Override
    void delete(Books deleted);
}
