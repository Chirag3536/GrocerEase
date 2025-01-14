package com.chirag.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.chirag.model.PasswordResetToken;

public interface PasswordResetTokenRepository extends JpaRepository<PasswordResetToken, Integer> {
	PasswordResetToken findByToken(String token);
}
