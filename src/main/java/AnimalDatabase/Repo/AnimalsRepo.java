package AnimalDatabase.Repo;

import AnimalDatabase.DataRest.Animals;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource(collectionResourceRel = "animals", path = "animals")
public interface AnimalsRepo extends PagingAndSortingRepository<Animals, Long> {
    List<Animals> findById(@Param("id") long id);
    List<Animals> findByAnimals(@Param("animals") String animals);
    List<Animals> findByCommonName(@Param("commonName") String commonName);
}
