package relation.test;


import org.springframework.data.repository.CrudRepository;


public interface PageRepository extends CrudRepository<Page, Long> {

//    List<Page> findByBook(Book book, Sort sort);
}