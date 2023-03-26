package com.riannreis.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.riannreis.course.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{

}
