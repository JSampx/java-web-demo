package com.webapp.demo.repositories;

import com.webapp.demo.entities.Order;


import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
