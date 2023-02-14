package Student_Library.Library_Management.Service;

import Student_Library.Library_Management.Models.Author;
import Student_Library.Library_Management.Repositories.AuthorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AuthorService {
    @Autowired
    AuthorRepository authorRepository;

    public String createAuthor(Author author) {
        authorRepository.save(author);
        return"author created successfully";
    }
}
