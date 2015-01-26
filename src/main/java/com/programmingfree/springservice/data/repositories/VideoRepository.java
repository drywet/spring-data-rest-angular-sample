package com.programmingfree.springservice.data.repositories;

import com.programmingfree.springservice.data.entities.Subcategory;
import com.programmingfree.springservice.data.entities.Video;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource
public interface VideoRepository extends CrudRepository<Video, Integer> {

	//List<Categories> findByTaskArchived(@Param("archivedfalse") int taskArchivedFalse);

	//public final static String QUERY = "select t.taskName FROM Task t WHERE t.id=1";
	//@Query(QUERY)
	List<Video> findBySubcategory(@Param("subcategory") Subcategory subcategory, Pageable p);
}
