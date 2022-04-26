package ru.itis.services;

import ru.itis.dto.ProductRequest;
import ru.itis.dto.ProductResponse;

import java.util.List;

public interface ProductService {
    ProductResponse getProductById(Long id);

    List<ProductResponse> getAllProducts();

    ProductResponse addProduct(ProductRequest productRequest);

    ProductResponse updateProduct(Long id, ProductRequest productRequest);

    void deleteProduct(Long id);
}
