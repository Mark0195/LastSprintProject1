package AnimalDatabase.Repo;


import AnimalDatabase.DataRest.passwordtable;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource(collectionResourceRel = "password", path = "password")
public interface PasswordRepo  extends PagingAndSortingRepository<passwordtable, Long> {
    List<passwordtable> findById(@Param("id") long id);
    List<passwordtable> findByEmail(@Param("email") String email);
    List<passwordtable> findByPassword(@Param("password") String password);
}
