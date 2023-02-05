package mx.com.gm.domain;

import jakarta.persistence.*;
import java.io.Serializable;
import lombok.Data;

@Data
@Entity
@Table(name="vehiculos_lanzadera")
public class Vehiculos_lanzadera  implements Serializable{
    
    private static final long serialVersionUID = 1l;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_lanzadera;
    
    private double peso_toneladas;
    
    private String carga;
}
