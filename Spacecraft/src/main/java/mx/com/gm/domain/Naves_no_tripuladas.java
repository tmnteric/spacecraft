
package mx.com.gm.domain;

import jakarta.persistence.*;
import java.io.Serializable;
import lombok.Data;

@Data
@Entity
@Table(name="naves_no_tripuladas")
public class Naves_no_tripuladas  implements Serializable {
    
    private static final long serialVersionUID = 1l;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_nave_no_tripulada;
    
    private String donde_orbita;
    
    private int motores;
    
    private String distancia_de_la_tierra;
    
}
