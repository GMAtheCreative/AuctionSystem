package auctionSystem.Services;

import auctionSystem.Dtos.requests.ProductRequestDTO;
import auctionSystem.Dtos.responses.ProductResponseDTO;

import java.util.List;

public interface ProductServices {
    List<ProductResponseDTO> getAllProducts();
    ProductResponseDTO getProductById(String id);
    ProductResponseDTO createProduct(ProductRequestDTO productRequestDTO);
    ProductResponseDTO updateProduct(String id, ProductRequestDTO productRequestDTO);
    ProductResponseDTO deleteProduct (String id);
}
