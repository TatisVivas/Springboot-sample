package com.sample.demo;


import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

@RestController
public class HolaMundoController {
    //https://8080-tatisvivas-springbootsa-5u3781k9z6z.ws-us110.gitpod.io/
    @GetMapping("/")
    public String hola() {
        return "Hola Mundo";
    }
    //https://8080-tatisvivas-springbootsa-5u3781k9z6z.ws-us110.gitpod.io/saludo?nombre=Tatis
    @GetMapping("/saludo")
    public String saludo(@RequestParam String nombre) {
        return "Hola " + nombre;
    }
    //https://8080-tatisvivas-springbootsa-5u3781k9z6z.ws-us110.gitpod.io/suma?a=10&b=11
    @GetMapping("/suma")
    public String Suma(@RequestParam Integer a, @RequestParam Integer b) {
        return "" + (a + b);
    }
//https://8080-tatisvivas-springbootsa-5u3781k9z6z.ws-us110.gitpod.io/libro?id=10

    @GetMapping("/validar/{clase}")
    public String validar(@PathVariable String clase, @RequestParam String id) {
        return "validando la clase " + clase +  " y el id " + id;
    }

}
