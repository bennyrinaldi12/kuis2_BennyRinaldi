/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tib.kuis_1014.entity;

import java.io.Serializable;
import static java.lang.reflect.Array.set;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author PC-27-320
 */
@Entity
@Table(name = "tb_mobil_1014")
public class Mobil implements Serializable {    

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(length = 255, nullable = false, unique = true)
    private String nama;
    @Column(length = 255, nullable = true)
    private String tahun;
    @Column(length = 255, nullable = true)
    private String merk;
    @OneToMany
    @JoinColumn(name="id")
    private Set<Aksesoris>Aksesoris;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    //
    public String getNama() {
        return nama;
    }
    
    public void setNama(String nama) {
        this.nama = nama;
    }
    //
    public String getTahun() {
        return tahun;
    }
    
    public void setTahun(String tahun) {
        this.tahun = tahun;
    }
    //
    public String getMerk() {
        return merk;
    }
    
    public void setMerk(String merk) {
        this.merk = merk;
    }
}
