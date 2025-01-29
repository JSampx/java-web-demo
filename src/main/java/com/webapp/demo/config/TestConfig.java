package com.webapp.demo.config;

import com.webapp.demo.entities.Order;
import com.webapp.demo.entities.User;
import com.webapp.demo.repositories.OrderRepository;
import com.webapp.demo.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.time.Instant;
import java.util.Arrays;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private OrderRepository orderRepository;

    @Override
    public void run(String... args) throws Exception {
        User u1 = new User(null, "Maria", "9999999", "maria@gmail.com", "123456");
        User u2 = new User(null, "Alex", "99999998", "alex@gmail.com", "654321");


        Order o1 = new Order(null, Instant.parse("2025-01-28T19:23:01Z"), u1);
        Order o2 = new Order(null, Instant.parse("2025-01-28T20:03:11Z"), u2);
        Order o3 = new Order(null, Instant.parse("2025-01-29T10:13:10Z"), u2);
        userRepository.saveAll(Arrays.asList(u1, u2));
        orderRepository.saveAll(Arrays.asList(o1, o2, o3));
    }
}
