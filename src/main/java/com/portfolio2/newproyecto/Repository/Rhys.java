/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.portfolio2.newproyecto.Repository;

import com.portfolio2.newproyecto.Entity.hys;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author DeniseAMD
 */
public interface Rhys extends JpaRepository<hys, Integer>{
    Optional<hys>findByNombre(String nombre);
    public boolean existsByNombre(String nombre);
}
