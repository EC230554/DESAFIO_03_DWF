package sv.edu.udb.Desafio_01.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping("/")
    public String home() {
        return "¡Proyecto Desafio_01 funcionando!";
    }
}
