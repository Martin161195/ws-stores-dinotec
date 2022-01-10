package pe.com.encuentralope.supportwebpagesh2.stores.business;

import pe.com.encuentralope.supportwebpagesh2.stores.model.dto.request.StoreRequestDTO;
import reactor.core.publisher.Mono;

public interface StoreService {

    public Mono<Void> getAllStores();
    public Mono<Void> getStoreById(String storeId);
    public Mono<Void> saveStore(StoreRequestDTO storeRequestDTO);
    public Mono<Void> updateStore(String storeId, StoreRequestDTO storeRequestDTO);
    public Mono<Void> deleteStore(String storeID);


}
