package com.example.demo.service;

import com.example.demo.commons.GenericServiceImpl;
import com.example.demo.dao.PersonaDaoApi;
import com.example.demo.model.Persona;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

@Service
public class PersonaServiceImpl extends GenericServiceImpl<Persona, Long> implements PersonaServiceApi {

    @Autowired
    private PersonaDaoApi personaDaoApi;

    @Override
    public CrudRepository<Persona, Long> getDao() {
        return personaDaoApi;
    }
}
