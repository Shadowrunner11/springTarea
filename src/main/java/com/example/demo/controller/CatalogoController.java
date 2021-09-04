package com.example.demo.controller;

import com.example.demo.model.Persona;
import com.example.demo.model.Producto;
import com.example.demo.service.ProductoServiceApi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CatalogoController {

    @Autowired
    private ProductoServiceApi productoServiceApi;

    @RequestMapping("/catalogo")
    public String show(Model model){
        model.addAttribute("productos", productoServiceApi.getAll());
        return "catalogo";
    }
    @GetMapping("/detail/{id}")
    public String showSave(@PathVariable("id") Long id, Model model){
        if(id != null) {
            model.addAttribute("producto", productoServiceApi.get(id));
        }
        return "detail";
    }

}
