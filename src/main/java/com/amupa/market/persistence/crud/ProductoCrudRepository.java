package com.amupa.market.persistence.crud;

import com.amupa.market.persistence.entity.Producto;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

//los metodos que estan firmados aqui son implmentados en ProductoRepository.java
public interface ProductoCrudRepository extends CrudRepository<Producto, Integer> {

    //con Query method cuando spring Data no nos ayuda
    List<Producto> findByIdCategoriaOrderByNombreAsc(int idCategoria);

    //otra forma es usando query nativa y ahi el nombre del metodo puede ser el que se desee
    //@Query(value = "SELECT * FROM productos WHERE id_categoria = ?", nativeQuery = true)
    //List<Producto> getByCategoria(int idCategoria);

    //se pueden usar optional para manejar ausencia de datos
    Optional<List<Producto>> findByCantidadStockLessThanAndEstado(int cantidadStock, boolean estado);

}
