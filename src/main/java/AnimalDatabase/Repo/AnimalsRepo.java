package AnimalDatabase.Repo;

import AnimalDatabase.DataRest.Mock_data;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;
import java.util.Optional;

@RepositoryRestResource(collectionResourceRel = "mockdata", path = "mockdata")
public interface AnimalsRepo extends JpaRepository<Mock_data, Long> {
    Optional<Mock_data> findById(@Param("id") long id);
    List<Mock_data> findByAnimals(@Param("animals") String animals);
    List<Mock_data> findByCommonName(@Param("commonName") String commonName);
}
