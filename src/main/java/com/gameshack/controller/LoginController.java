package com.gameshack.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {
    
    @GetMapping("/login")
    public String mostrarLogin() {
        return "login"; // Retorna el nombre de la vista login (login.html)
    }

       @PostMapping("/login")
    public String login(@RequestParam String email, @RequestParam String password) {
        // Aquí debes manejar la lógica para verificar el email y la contraseña.
        // Si el inicio de sesión es exitoso:
        return "redirect:/home";  // Redirige a la página principal o dashboard.
        // Si falla, podrías redirigir nuevamente a la página de login con un mensaje de error.
    }
    
    @GetMapping("/registro")
    public String mostrarFormularioRegistro() {
        return "registro"; // Esto buscará "registro.html" en el directorio de recursos estáticos
    }
    
}
