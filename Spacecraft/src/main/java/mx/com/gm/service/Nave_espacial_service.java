// en esta clase generamos los metodoss para listar naves y guardar las respectivas naves ne su base de datos
package mx.com.gm.service;

import java.util.List;
import mx.com.gm.domain.nave_espacial;

public interface Nave_espacial_service {
    
    //metodo para listar las naves
    public List<nave_espacial> listnaves(String palabraClave);
    
    //metodo para guardar las naves
    public void guardar(nave_espacial naveEspacial);
    
}
