
package com.gameshack.controller;

import com.gameshack.model.Usuario;
import com.gameshack.repository.UsuarioRepository;
import com.gameshack.service.UsuarioService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/usuarios")
public class UsuarioController {

    @Autowired
    private UsuarioRepository usuarioRepository;

    // Endpoint para crear un nuevo usuario
    @PostMapping
    public ResponseEntity<String> crearUsuario(@RequestBody Usuario usuario) {
        try {
            // Guardar el usuario en la base de datos
            usuarioRepository.save(usuario);
            return ResponseEntity.ok("¡Usuario creado con éxito!");
        } catch (Exception e) {
            // Manejo de errores
            return ResponseEntity.status(500).body("Hubo un error al crear la cuenta.");
        }
    }
}
