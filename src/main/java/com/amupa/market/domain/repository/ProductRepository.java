package com.amupa.market.domain.repository;

import com.amupa.market.domain.Product;

import java.util.List;
import java.util.Optional;

public interface ProductRepository {
    //se indica la firma de metodos que cualquier repositorio que trabaje con productos tenga que implmentar
    List<Product> getAll();
    Optional<List<Product>> getByCategory(int categoryid);
    Optional<List<Product>> getScarseProducts(int quantity);
    Optional<Product> getProduct(int productoId);
    Product save(Product product);
    void delete(int productoId);
}
