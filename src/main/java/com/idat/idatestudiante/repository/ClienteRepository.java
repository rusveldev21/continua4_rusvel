package com.idat.idatestudiante.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.idat.idatestudiante.entity.*;



public interface ClienteRepository extends JpaRepository<Cliente, Integer> {

}
