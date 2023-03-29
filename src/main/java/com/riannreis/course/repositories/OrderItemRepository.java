package com.riannreis.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.riannreis.course.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long>{

}
