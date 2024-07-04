package com.chirag.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.chirag.model.Review;

public interface ReviewRepository extends JpaRepository<Review, Long> {

}
