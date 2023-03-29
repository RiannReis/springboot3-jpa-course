package com.riannreis.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.riannreis.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{

}
