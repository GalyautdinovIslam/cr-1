package ru.itis.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import ru.itis.models.Product;

import java.util.List;
import java.util.stream.Collectors;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ProductResponse {

    private Long id;
    private String title;
    private Long amount;
    private Double price;

    public static ProductResponse from(Product product) {
        return ProductResponse.builder()
                .id(product.getId())
                .title(product.getTitle())
                .amount(product.getAmount())
                .price(product.getPrice())
                .build();
    }

    public static List<ProductResponse> from(List<Product> products) {
        return products.stream().map(ProductResponse::from).collect(Collectors.toList());
    }
}
