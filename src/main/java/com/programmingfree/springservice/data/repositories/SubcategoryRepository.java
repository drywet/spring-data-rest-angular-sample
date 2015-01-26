package com.programmingfree.springservice.data.repositories;

import com.programmingfree.springservice.data.entities.Subcategory;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface SubcategoryRepository extends CrudRepository<Subcategory, Integer> {

	//List<Categories> findByTaskArchived(@Param("archivedfalse") int taskArchivedFalse);

	//public final static String QUERY = "select t.taskName FROM Task t WHERE t.id=1";
	//@Query(QUERY)
	//public List<Categories> lol();

}
