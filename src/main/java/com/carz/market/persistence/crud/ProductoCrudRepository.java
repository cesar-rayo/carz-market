package com.carz.market.persistence.crud;

import com.carz.market.persistence.entity.Producto;
import org.springframework.data.repository.CrudRepository;

//CrudRepository<TableClass, entity>
public interface ProductoCrudRepository extends CrudRepository<Producto, Integer> {
}
