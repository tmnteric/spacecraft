//creacion de la clase nave espacial con su entidad de la cual se trae los atributos de la base de datos

package mx.com.gm.domain;

import jakarta.persistence.*;
import java.io.Serializable;
import java.sql.Date;
import lombok.Data;

@Data
@Entity
@Table(name="nave_espacial")
public class nave_espacial implements Serializable{
    
    //se implementa este atributo para que no genere error la interfaz ya que es serializada  
    private static final long serialVersionUID = 1l;
    
    //agregamos la anotacion @GeneratedValue para generar los valores de la clave primaria, ya que los genera JPA automaticamente
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int Id_nave;
    
    private String tipo_nave;
    
    private String nombre;
    
    private String pais_creacion;
    
    private String combustible;
    
    private int fecha;
    
    private String potencia;
    
    private String peso_toneladas;
    
    private String carga;
    
    private String donde_orbita;
    
    private int motores;
    
    private String distancia_de_la_tierra;

    private int cantidad_pasajeros;
    
    private String misiones;
}
