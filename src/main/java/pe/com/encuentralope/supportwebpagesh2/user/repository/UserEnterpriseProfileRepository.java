package pe.com.encuentralope.supportwebpagesh2.user.repository;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import pe.com.encuentralope.supportwebpagesh2.user.model.domain.UserEnterpriseProfile;

@Repository
public interface UserEnterpriseProfileRepository extends CrudRepository<UserEnterpriseProfile, Long> {
}
