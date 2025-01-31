package com.example.devopsTraining.Controllers;

import com.example.devopsTraining.Models.Product;
import com.example.devopsTraining.Services.ProductService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
public class ProductController {

    private final ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @PostMapping("/add")
    public ResponseEntity<?> addProduct2(@RequestBody Product product){
        log.info("product add: " + product);

        Product product1 = new Product(product.getName(), product.getDescription());

        return  new ResponseEntity<>(productService.addProduct2(product1), HttpStatus.OK);
    }

    @GetMapping("/add/{name}")
    public ResponseEntity<?> addProduct(@PathVariable String name){
        log.info("add product: name = " + name);

        return new ResponseEntity<>(productService.addProduct(name), HttpStatus.OK);
    }

    @GetMapping("/get/all")
    public ResponseEntity<?> getAllProducts(){
        log.info("get all products");
        return new ResponseEntity<>(productService.getAllProducts(), HttpStatus.OK);
    }

}
