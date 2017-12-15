/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tib.kuis_1014.repo;

import com.tib.kuis_1014.entity.Aksesoris;
import com.tib.kuis_1014.entity.Mobil;
import java.util.List;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author PC-27-320
 */
public interface AksesorisRepo extends CrudRepository<Aksesoris, Long> {

    @Query("select c from Merk c")
    public List<Aksesoris> findAllAksesoris();
}