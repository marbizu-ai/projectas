
package com.gameshack.controller;

import com.gameshack.model.Producto;
import com.gameshack.service.ProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import java.util.List;

@Controller
public class ProductoController {

    @Autowired
    private ProductoService productoService;

    @GetMapping("/productos")
    public String mostrarProductos(Model model) {
        List<Producto> productos = productoService.obtenerTodosLosProductos();
        System.out.println("Productos: " + productos);
        model.addAttribute("productos", productos);
        return "productos";  // Nombre del archivo HTML para la vista de productos
    }
}

