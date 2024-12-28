package auctionSystem.Services;

import auctionSystem.Data.Models.Product;
import auctionSystem.Data.Repositories.ProductRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class ProductServiceImplTest {
    @Autowired
    private ProductServiceImpl service;
    @Autowired
    private ProductRepository productRepository;

    private Product product;
    @BeforeEach
    void setUp() {
        
    }

    @Test
    void getAllProducts() {
    }

    @Test
    void getProductsByCategory() {
    }

    @Test
    void getProductByName() {
    }

    @Test
    void createProduct() {
    }

    @Test
    void updateProduct() {
    }

    @Test
    void deleteProduct() {
    }
}