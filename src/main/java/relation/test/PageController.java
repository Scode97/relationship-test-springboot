package relation.test;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController  
public class PageController {
 
@Autowired  
PageService pageService;  
//creating a get mapping that retrieves all the books detail from the database  

@GetMapping("/page")  
private List<Page> getAllPages()   
{ 
	
return pageService.getAllPages();  
}
}