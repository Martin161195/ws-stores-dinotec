package pe.com.encuentralope.supportwebpagesh2.stores.business.impl;


import org.springframework.stereotype.Service;
import pe.com.encuentralope.supportwebpagesh2.stores.business.StoreService;
import pe.com.encuentralope.supportwebpagesh2.stores.model.dto.request.StoreRequestDTO;
import reactor.core.publisher.Mono;

@Service
public class StoreServiceImpl implements StoreService {




    @Override
    public Mono<Void> getAllStores() {
        return null;
    }

    @Override
    public Mono<Void> getStoreById(String storeId) {
        return null;
    }

    @Override
    public Mono<Void> saveStore(StoreRequestDTO storeRequestDTO) {
        return null;
    }

    @Override
    public Mono<Void> updateStore(String storeId, StoreRequestDTO storeRequestDTO) {
        return null;
    }

    @Override
    public Mono<Void> deleteStore(String storeID) {
        return null;
    }
}
