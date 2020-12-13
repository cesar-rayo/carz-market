package com.carz.market.persistence;

import com.carz.market.persistence.crud.ProductoCrudRepository;
import com.carz.market.persistence.entity.Producto;

import java.util.List;

public class ProductoRepository {
    private ProductoCrudRepository productoCrudRepository;

    public List<Producto> getAl(){
        return (List<Producto>) productoCrudRepository.findAll();
    }

}
