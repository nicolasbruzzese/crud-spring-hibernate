package com.nicolas.controlador;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ControladorInicio {

    // Mostrar la página de inicio
    @GetMapping("/")
    public String index() {
        // Devuelve la vista "index.jsp"
        return "index";
    }
}
