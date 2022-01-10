package pe.com.encuentralope.supportwebpagesh2.user.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import pe.com.encuentralope.supportwebpagesh2.user.model.domain.UserEnterpriseSector;


@Repository
public interface UsersEnterpriseSectorRepository extends CrudRepository<UserEnterpriseSector, Long> {


}
