package relation.test;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service 
public class BookService {

@Autowired  
BookRepository booksRepository;  
//getting all books record by using the method findaAll() of CrudRepository  
public List<Book> getAllBooks()   
{  
List<Book> books = new ArrayList<Book>();  
booksRepository.findAll().forEach(books1 -> books.add(books1));  
return books;  

}  



}