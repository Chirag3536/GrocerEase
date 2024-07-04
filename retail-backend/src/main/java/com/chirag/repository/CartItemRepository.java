package com.chirag.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.chirag.model.CartItem;

public interface CartItemRepository extends JpaRepository<CartItem, Long> {


//    CartItem findByFoodIsContaining

}
