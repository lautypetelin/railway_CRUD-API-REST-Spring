package com.lautaropetelin.apirest.apirest.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lautaropetelin.apirest.apirest.Entities.Producto;

public interface ProductoRepository extends JpaRepository<Producto, Long>{

}