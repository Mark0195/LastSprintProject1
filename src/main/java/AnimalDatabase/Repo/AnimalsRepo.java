package AnimalDatabase.Repo;

import AnimalDatabase.DataRest.mock_data;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource(collectionResourceRel = "animals", path = "animals")
public interface AnimalsRepo extends PagingAndSortingRepository<mock_data, Long> {
    List<mock_data> findById(@Param("id") long id);
    List<mock_data> findByAnimals(@Param("animals") String animals);
    List<mock_data> findByCommonName(@Param("commonName") String commonName);
}
