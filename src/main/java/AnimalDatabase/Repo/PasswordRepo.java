package AnimalDatabase.Repo;


import AnimalDatabase.DataRest.Passwordtable;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource(collectionResourceRel = "password", path = "password")
public interface PasswordRepo  extends PagingAndSortingRepository<Passwordtable, Long> {
    List<Passwordtable> findById(@Param("id") long id);
    List<Passwordtable> findByEmail(@Param("email") String email);
    List<Passwordtable> findByPassword(@Param("password") String password);
}
