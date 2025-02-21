package com.example.devopsTraining.Repositories;

import com.example.devopsTraining.Models.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
}
