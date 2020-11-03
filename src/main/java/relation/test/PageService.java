package relation.test;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service 
public class PageService {

@Autowired  
PageRepository pageRepository;  
//getting all books record by using the method findaAll() of CrudRepository  
public List<Page> getAllPages()   
{  
List<Page> books = new ArrayList<Page>();  
pageRepository.findAll().forEach(books1 -> books.add(books1));  
return books;  

}  



}