package com.example.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entities.Category;
import com.example.demo.entities.Product;
import com.example.demo.entities.User;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
