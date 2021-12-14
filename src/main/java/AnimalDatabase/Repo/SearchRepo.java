package AnimalDatabase.Repo;

import AnimalDatabase.DataRest.searchtable;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource(collectionResourceRel = "search", path = "search")
public interface SearchRepo extends PagingAndSortingRepository<searchtable, List> {
    List<searchtable> findById(@Param("id") long id);
    List<searchtable> findByEmail(@Param("email") String email);
    List<searchtable> findBySearch(@Param("search") String search);
}
