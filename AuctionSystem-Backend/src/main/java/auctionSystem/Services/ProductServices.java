package auctionSystem.Services;

import auctionSystem.Dtos.requests.product.*;
import auctionSystem.Dtos.responses.product.*;

import java.util.List;

public interface ProductServices {
    List<GetAllProductResponse> getAllProducts();
    List<PoductResponseByCategory> getProductsByCategory(PoductRequestByCategory productRequestByCategory);
    ProductResponseByName getProductByName(GetProductRequestByName productRequestByName);
    CreateProductResponse createProduct(CreateProductRequest createProductRequest);
    UpdateProductResponse updateProduct(UpdateProductRequest updateProductRequest);
    DeleteProductResponse deleteProduct (DeleteProductRequest deleteProductRequest);
}
