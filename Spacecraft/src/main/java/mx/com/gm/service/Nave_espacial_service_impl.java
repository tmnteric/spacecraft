package mx.com.gm.service;

import java.util.List;
import mx.com.gm.domain.nave_espacial;
import mx.com.gm.repository.Nave_espacial_repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class Nave_espacial_service_impl implements Nave_espacial_service{

    //inyectamos la dependencia Nave_espacial_repository
    @Autowired
    private Nave_espacial_repository repository;
    
    
    //inyectamos transacciones de JPA de solo lectura para crear el metodo listNave
    @Transactional(readOnly = true)
    public List<nave_espacial> listnaves(String palabraClave) {
        if(palabraClave !=null){
            return repository.findAll(palabraClave);
        }
        return (List<nave_espacial>) repository.findAll();
    }

    //inyectamos transacciones de JPA para crear el metodo guardar
    @Override
    @Transactional
    public void guardar(nave_espacial nave_espacial) {
        repository.save(nave_espacial);
    }
}
