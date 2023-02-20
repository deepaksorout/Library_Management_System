package Student_Library.Library_Management.Service;

import Student_Library.Library_Management.DTOs.AuthorEntityDto;
import Student_Library.Library_Management.Models.Author;
import Student_Library.Library_Management.Repositories.AuthorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AuthorService {
    @Autowired
    AuthorRepository authorRepository;

    public String createAuthor(AuthorEntityDto authorEntityDto) {
        Author author=new Author();
        author.setAge(authorEntityDto.getAge());
        author.setCountry(authorEntityDto.getCountry());
        author.setName(authorEntityDto.getName());
        author.setRating(authorEntityDto.getRating());


        authorRepository.save(author);
        return"author created successfully";
    }
}
