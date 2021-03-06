/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tib.kuis_1014.entity;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author PC-27-320
 */
@Entity
@Table(name = "tb_aksesoris_1014")
public class Aksesoris implements Serializable {    

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(length = 255, nullable = false, unique = true)
    private String nama;
    @Column(length = 255, nullable = true)
    private String harga;
    @Column(length = 255, nullable = true)
    private String tipe;
    @OneToMany
    private Aksesoris aksesoris;

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
    public String getHarga() {
        return harga;
    }
    
    public void setHarga(String harga) {
        this.harga = harga;
    }
    //
    public String getTipe() {
        return tipe;
    }
    
    public void setTipe(String tipe) {
        this.tipe = tipe;
    }
}