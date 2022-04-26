package ru.itis.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import ru.itis.dto.ProductRequest;
import ru.itis.dto.ProductResponse;
import ru.itis.services.ProductService;

@RequiredArgsConstructor
@Controller
public class ProductController {

    private final ProductService productService;

    @GetMapping("/products/{id}")
    public String getAllProductsPage(@PathVariable("id") Long id, Model model) {
        model.addAttribute("product", productService.getProductById(id));
        return "product_page";
    }

    @GetMapping("/products")
    public String getAllProductsPage(Model model) {
        model.addAttribute("products", productService.getAllProducts());
        return "all_products_page";
    }

    @GetMapping("/products/add")
    public String getAddProductPage() {
        return "add_product_page";
    }

    @PostMapping("/products/add")
    public String addProduct(ProductRequest productRequest) {
        ProductResponse product = productService.addProduct(productRequest);
        return "redirect:/products/" + product.getId();
    }
}
