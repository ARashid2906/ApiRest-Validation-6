package mx.edu.utez.validacion.service;


import mx.edu.utez.validacion.entity.Formulario;
import mx.edu.utez.validacion.repository.FormularioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Service
public class FormularioService {
    @Autowired
    private FormularioRepository repository;

public Formulario save( @RequestBody Formulario formulario){
        
        return repository.save(formulario);
    }



    public Formulario getByEmail(String correo){
        return repository.searchByEmail(correo);
    }

    public List<Formulario> getAll(){
        return repository.findAll();
    }

   


}
