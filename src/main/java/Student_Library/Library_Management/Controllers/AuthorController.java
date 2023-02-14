package Student_Library.Library_Management.Controllers;

import Student_Library.Library_Management.Models.Author;
import Student_Library.Library_Management.Service.AuthorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/author")
public class AuthorController {
    @Autowired
    AuthorService authorService;

    @PostMapping("/add")
    public String createAuthor(@RequestBody Author author){
        return authorService.createAuthor(author);
    }
}
