package com.example.demo.service;

import com.example.demo.commons.GenericServiceImpl;
import com.example.demo.dao.ProductoDaoApi;
import com.example.demo.model.Producto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

@Service
public class ProductoServiceImpl extends GenericServiceImpl<Producto, Long> implements ProductoServiceApi{

    @Autowired
    private ProductoDaoApi productoDaoApi;

    @Override
    public CrudRepository<Producto, Long> getDao() {
        return productoDaoApi;
    }
}
