package mx.edu.utez.validacion.controller;

import mx.edu.utez.validacion.entity.Formulario;
import mx.edu.utez.validacion.service.FormularioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


import java.io.IOException;
import java.util.List;

@RestController
@RequestMapping("/formulario")
@CrossOrigin(origins = "*")
public class FormularioController {
/// BUENA
    @Autowired
    private FormularioService service;

    @GetMapping("/consultarTodos")
    public List<Formulario> listAll(){
        return service.getAll();
    }
    @GetMapping("/buscarCorreo/{correo}")
    public  Formulario findByCorreo(@PathVariable("correo")String correo){
        return service.getByEmail(correo);
    }


     @PostMapping("/guardar")
    public Formulario save(@RequestBody  Formulario formulario) throws IOException {
        return service.save(formulario);
    }
     
     
}
