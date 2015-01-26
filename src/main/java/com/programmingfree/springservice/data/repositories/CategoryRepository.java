package com.programmingfree.springservice.data.repositories;

import com.programmingfree.springservice.data.entities.Category;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface CategoryRepository extends CrudRepository<Category, Integer> {
    //Page<Category> findById(@Param("id") int id, Pageable p);

	//public final static String QUERY = "select t.taskName FROM Task t WHERE t.id=1";
	//@Query(QUERY)
	//public List<Categories> lol();

}