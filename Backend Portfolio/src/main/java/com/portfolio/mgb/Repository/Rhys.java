/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.portfolio.mgb.Repository;

import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;

import com.portfolio.mgb.Entity.hys;


public interface Rhys extends JpaRepository<hys, Integer>{
	
    Optional<hys> findByNombreHyS(String nombreHyS);
    public boolean existsByNombreHyS(String nombreHyS);
}
