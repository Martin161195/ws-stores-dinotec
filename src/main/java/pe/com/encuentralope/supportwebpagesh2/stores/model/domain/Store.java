package pe.com.encuentralope.supportwebpagesh2.stores.model.domain;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;


import java.io.Serializable;


@Getter
@Setter
@RequiredArgsConstructor
public class Store implements Serializable {

    private static final long serialVersionUID = -7269686477821030634L;

    private String storeId;
    private String storeName;
    private String storeQuery;
}
