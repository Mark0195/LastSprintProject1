package AnimalDatabase.Repo;

import AnimalDatabase.DataRest.Searchtable;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource(collectionResourceRel = "search", path = "search")
public interface SearchRepo extends PagingAndSortingRepository<Searchtable, List> {
    List<Searchtable> findById(@Param("id") long id);
    List<Searchtable> findByEmail(@Param("email") String email);
    List<Searchtable> findBySearched(@Param("searched") String searched);
}
