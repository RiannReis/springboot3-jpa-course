package com.riannreis.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.riannreis.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{

}
