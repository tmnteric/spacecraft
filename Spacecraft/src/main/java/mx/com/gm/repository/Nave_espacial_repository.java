package mx.com.gm.repository;

import java.util.List;
import mx.com.gm.domain.nave_espacial;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;


public interface Nave_espacial_repository extends CrudRepository<nave_espacial, String>{
    
    //Agregamos la anotacion @Query ya que nos permite traer directamente una sentencia de sql
    @Query("SELECT n FROM nave_espacial n WHERE"
            + " CONCAT(n.tipo_nave, n.nombre, n.pais_creacion, n.combustible, n.fecha, n.potencia)"
            + " LIKE %?1%")
    
    public List<nave_espacial> findAll(String palabraClave);
}
