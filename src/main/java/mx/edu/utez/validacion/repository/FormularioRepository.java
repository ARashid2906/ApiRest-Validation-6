package mx.edu.utez.validacion.repository;

import mx.edu.utez.validacion.entity.Formulario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;


@Repository
public interface FormularioRepository extends JpaRepository<Formulario, Long> {
    @Query(value = "SELECT * from formulario where correo =:correo",nativeQuery = true)
    Formulario searchByEmail(@Param("correo") String correo);

}
