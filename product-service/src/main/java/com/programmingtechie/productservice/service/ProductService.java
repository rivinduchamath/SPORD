package com.programmingtechie.productservice.service;

import com.programmingtechie.productservice.dto.ProductRequest;
import com.programmingtechie.productservice.dto.ProductResponse;

import java.util.List;

public interface ProductService {
     void createProduct(ProductRequest productRequest);
    List<ProductResponse> getAllProducts();
}
