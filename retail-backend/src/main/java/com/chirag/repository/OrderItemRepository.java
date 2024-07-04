package com.chirag.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.chirag.model.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
