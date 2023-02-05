package mx.com.gm.service;

import java.util.List;
import mx.com.gm.domain.nave_espacial;

public interface Nave_espacial_service {
    
    public List<nave_espacial> listnaves(String palabraClave);
    
    public void guardar(nave_espacial naveEspacial);
    
}
