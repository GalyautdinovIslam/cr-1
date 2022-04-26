package ru.itis.services;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ru.itis.dto.ProductRequest;
import ru.itis.dto.ProductResponse;
import ru.itis.exceptions.ProductNotFoundException;
import ru.itis.models.Product;
import ru.itis.repositories.ProductRepository;

import java.util.List;

@RequiredArgsConstructor
@Service
public class ProductServiceImpl implements ProductService {

    private final ProductRepository productRepository;

    @Override
    public ProductResponse getProductById(Long id) {
        return ProductResponse.from(productRepository.findById(id).orElseThrow(ProductNotFoundException::new));
    }

    @Override
    public List<ProductResponse> getAllProducts() {
        return ProductResponse.from(productRepository.findAll());
    }

    @Override
    public ProductResponse addProduct(ProductRequest productRequest) {
        Product product = Product.builder()
                .title(productRequest.getTitle())
                .amount(productRequest.getAmount())
                .price(productRequest.getPrice())
                .build();

        product = productRepository.save(product);
        return ProductResponse.from(product);
    }

    @Override
    public ProductResponse updateProduct(Long id, ProductRequest productRequest) {
        Product product = productRepository.findById(id).orElseThrow(ProductNotFoundException::new);

        product.setTitle(productRequest.getTitle());
        product.setAmount(productRequest.getAmount());
        product.setPrice(productRequest.getPrice());

        product = productRepository.save(product);
        return ProductResponse.from(product);
    }

    @Override
    public void deleteProduct(Long id) {
        Product product = productRepository.findById(id).orElseThrow(ProductNotFoundException::new);
        productRepository.delete(product);
    }
}
