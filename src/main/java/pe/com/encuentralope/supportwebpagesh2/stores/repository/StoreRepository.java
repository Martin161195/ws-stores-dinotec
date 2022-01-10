package pe.com.encuentralope.supportwebpagesh2.stores.repository;


import org.springframework.data.repository.CrudRepository;
import pe.com.encuentralope.supportwebpagesh2.stores.model.domain.Store;

public interface StoreRepository extends CrudRepository<Store, Long> {
}
