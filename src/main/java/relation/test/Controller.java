package relation.test;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController  
public class Controller {
 
@Autowired  
BookService booksService;  
//creating a get mapping that retrieves all the books detail from the database  

@GetMapping("/book")  
private List<Book> getAllBooks()   
{ 
	
	

return booksService.getAllBooks();  
}
}