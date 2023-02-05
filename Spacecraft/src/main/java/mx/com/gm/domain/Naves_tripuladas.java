package mx.com.gm.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.*;
import java.io.Serializable;
import lombok.Data;

@Data
@Entity
@Table(name="naves_tripuladas")
public class Naves_tripuladas implements Serializable{
    
    private static final long serialVersionUID = 1l;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_nave_tripulada;
    
    private int cantidad_pasajeros;
    
    private String misiones;
    
}
