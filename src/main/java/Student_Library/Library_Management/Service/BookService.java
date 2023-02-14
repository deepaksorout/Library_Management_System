package Student_Library.Library_Management.Service;

import Student_Library.Library_Management.Models.Author;
import Student_Library.Library_Management.Models.Book;
import Student_Library.Library_Management.Repositories.AuthorRepository;
import Student_Library.Library_Management.Repositories.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {
    @Autowired
    AuthorRepository authorRepository;

    public String addBook(Book book){

        int authorId=book.getAuthor().getId();

        Author author=authorRepository.findById(authorId).get();
        book.setAuthor(author);

        List<Book> currBooks=author.getBooksWritten();
        currBooks.add(book);
        author.setBooksWritten(currBooks);

        authorRepository.save(author);

        return"book added successfully";
    }
}
