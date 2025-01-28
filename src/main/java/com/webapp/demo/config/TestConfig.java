package com.webapp.demo.config;

import com.webapp.demo.entities.User;
import com.webapp.demo.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.util.Arrays;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {

    @Autowired
    private UserRepository userRepository;

    @Override
    public void run(String... args) throws Exception {
        User u1 = new User(null, "Maria", "9999999", "maria@gmail.com", "123456");
        User u2 = new User(null, "Alex", "99999998", "alex@gmail.com", "654321");

        userRepository.saveAll(Arrays.asList(u1, u2));
    }
}
