package com.itatechserviceweb.prototipo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.itatechserviceweb.prototipo.entities.Order;

public interface UserRepository extends JpaRepository<Order, Long>{

}
