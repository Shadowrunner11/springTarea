package com.example.demo.dao;

import com.example.demo.model.Persona;
import org.springframework.data.repository.CrudRepository;

public interface PersonaDaoApi extends CrudRepository<Persona, Long> {


}
