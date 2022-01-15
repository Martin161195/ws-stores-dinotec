package pe.com.encuentralope.supportwebpagesh2.user.repository;

import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import org.springframework.stereotype.Repository;
import pe.com.encuentralope.supportwebpagesh2.user.model.domain.User;
import reactor.core.publisher.Mono;

@Repository
public interface UserRepository extends ReactiveCrudRepository<User, Long> {

}
