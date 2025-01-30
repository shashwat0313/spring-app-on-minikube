package com.example.devopsTraining.Controllers;

import com.example.devopsTraining.Services.ProductService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class ProductController {

    private final ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping("/add/{name}")
    public ResponseEntity<?> addProduct(@PathVariable String name){
        log.info("add product: name = " + name);

        return new ResponseEntity<>(productService.addProduct(name), HttpStatus.OK);
    }

    @GetMapping("/get/all")
    public ResponseEntity<?> getAllProducts(){
        return new ResponseEntity<>(productService.getAllProducts(), HttpStatus.OK);
    }

}
