package com.loschidos.servidorcuentasporcobrar.repository;

import com.loschidos.servidorcuentasporcobrar.entity.Producto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductoRepository extends JpaRepository<Producto, Long> {

    Producto findById(int id);
}
