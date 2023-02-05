package mx.com.gm.domain;


import jakarta.persistence.*;
import java.io.Serializable;
import java.sql.Date;
import lombok.Data;

@Data
@Entity
@Table(name="nave_espacial")
public class nave_espacial implements Serializable{
    
    private static final long serialVersionUID = 1l;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int Id_nave;
    
    private String tipo_nave;
    
    private String nombre;
    
    private String pais_creacion;
    
    private String combustible;
    
    private int fecha;
    
    private String potencia;
    
    private double peso_toneladas;
    
    private String carga;
    
    private String donde_orbita;
    
    private int motores;
    
    private double distancia_de_la_tierra;

    private int cantidad_pasajeros;
    
    private String misiones;
}
