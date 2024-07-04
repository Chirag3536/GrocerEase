package com.chirag.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.chirag.model.Address;

public interface AddressRepository extends JpaRepository<Address, Long> {

}
