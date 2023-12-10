package booklog.example.Booky.controller;

import booklog.example.Booky.models.Book;
import booklog.example.Booky.repos.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class BookController {

    @Autowired
    private BookRepository bookRepo;

    @GetMapping(value = "/")
    public List<Book> getAllBook() {
        return bookRepo.findAll();
    }

    @GetMapping(value = "/{bookId}")
    public Book getBookById(@PathVariable String bookId) {
        return bookRepo.getBookById(bookId);
    }

    @PostMapping(value = "/add")
    public Book addBook(@RequestBody Book book) {
        return bookRepo.save(book);
    }

    @PutMapping(value = "/update")
    public Book updateBook(@RequestBody Book book) {
        return bookRepo.save(book);
    }

    @DeleteMapping(value = "/delete/{bookId}")
    public void deleteBook(@PathVariable String bookId) {
        bookRepo.deleteById(bookId);
    }
}
