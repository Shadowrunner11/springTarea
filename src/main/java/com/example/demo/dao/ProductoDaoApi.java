package com.example.demo.dao;


import com.example.demo.model.Producto;
import org.springframework.data.repository.CrudRepository;

public interface ProductoDaoApi extends CrudRepository<Producto, Long> {
}
