package mx.com.gm.repository;

import java.util.List;
import mx.com.gm.domain.nave_espacial;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

//public interface Nave_espacial_repository extends JpaRepository<nave_espacial, Long>{
public interface Nave_espacial_repository extends CrudRepository<nave_espacial, String>{
    
    @Query("SELECT n FROM nave_espacial n WHERE"
            + " CONCAT(n.tipo_nave, n.nombre, n.pais_creacion, n.combustible, n.fecha, n.potencia, n.peso_toneladas, n.carga, n.donde_orbita, n.motores, n.distancia_de_la_tierra, n.cantidad_pasajeros, n.misiones)"
            + " LIKE %?1%")
    
    public List<nave_espacial> findAll(String palabraClave);
}
