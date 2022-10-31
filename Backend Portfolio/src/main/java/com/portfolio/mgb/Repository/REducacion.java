package com.portfolio.mgb.Repository;

import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.portfolio.mgb.Entity.Educacion;

@Repository
public interface REducacion extends JpaRepository<Educacion, Integer>{
	
    public Optional<Educacion> findByNombreEducacion(String nombreEducacion);
    
    public boolean existsByNombreEducacion(String nombreEducacion);
}
