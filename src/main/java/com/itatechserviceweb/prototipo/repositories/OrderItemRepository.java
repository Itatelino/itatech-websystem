package com.itatechserviceweb.prototipo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.itatechserviceweb.prototipo.entities.OrderItem;


public interface OrderItemRepository extends JpaRepository<OrderItem, Long>{

}
