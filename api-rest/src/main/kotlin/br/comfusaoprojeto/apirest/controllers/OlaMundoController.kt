package br.comfusaoprojeto.apirest.controllers

import br.comfusaoprojeto.apirest.entity.Usuario
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("api/olamundo")
class OlaMundoController {

    @GetMapping
    fun tratarolamundo () : Usuario {
        return Usuario("usuario teste", "teste@teste.com","123456")
    }
}