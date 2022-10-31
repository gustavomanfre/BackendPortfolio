package com.portfolio.mgb.Service;

import java.util.List;
import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.portfolio.mgb.Entity.hys;
import com.portfolio.mgb.Repository.Rhys;

@Transactional
@Service
public class Shys {
	
    @Autowired
    Rhys rhys;
    
    public List<hys> list(){
        return rhys.findAll();
    }
    
    public Optional<hys> getOne(int id){
        return rhys.findById(id);
    }
    
    public Optional<hys> getByNombreHyS(String nombreHyS){
        return rhys.findByNombreHyS(nombreHyS);
    }
    
    public void save(hys skill){
        rhys.save(skill);
    }
    
    public void delete(int id){
        rhys.deleteById(id);
    }
    
    public boolean existsById(int id){
        return rhys.existsById(id);
    }
    
    public boolean existsByNombreHyS(String nombreHyS){
        return rhys.existsByNombreHyS(nombreHyS);
    }
}
