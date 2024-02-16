package com.example.controllergetcompleta;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/v2")
public class HomeController {
    @GetMapping(path = "/ciao/{provincia}")
    public User ciao(@RequestParam String nome, @PathVariable String provincia) {
        return new User(nome, provincia, "Ciao" + nome + ", com'è il tempo in " + provincia + "?");
    }
    //localhost:8080/v2/ciao/Lombardia?nome=Giuseppe

    @PostMapping("/casa")
    public String casa(@RequestParam User user) {
        return  user.toString();
    }
}
