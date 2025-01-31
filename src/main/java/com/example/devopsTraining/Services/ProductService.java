package com.example.devopsTraining.Services;

import com.example.devopsTraining.Models.Product;
import com.example.devopsTraining.Repositories.ProductRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
//@RequiredArgsConstructor
public class ProductService {

    private final ProductRepository productRepository;

    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public Product addProduct(String name){

        Product product = new Product(name);

        return productRepository.save(product);
    }

    public Product addProduct2(Product product){
        log.info("add2 service: " + product);
        return productRepository.save(product);
    }

    public List<Product> getAllProducts(){
        return productRepository.findAll();
    }
}
