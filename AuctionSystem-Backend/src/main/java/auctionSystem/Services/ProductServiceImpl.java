package auctionSystem.Services;

import auctionSystem.Dtos.requests.product.*;
import auctionSystem.Dtos.responses.product.*;
import auctionSystem.Services.ProductServices;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductServices {

    @Override
    public List<GetAllProductResponse> getAllProducts() {
        return List.of();
    }

    @Override
    public List<PoductResponseByCategory> getProductsByCategory(PoductRequestByCategory productRequestByCategory) {
        return List.of();
    }

    @Override
    public ProductResponseByName getProductByName(GetProductRequestByName productRequestByName) {
        return null;
    }

    @Override
    public CreateProductResponse createProduct(CreateProductRequest createProductRequest) {
        return null;
    }

    @Override
    public UpdateProductResponse updateProduct(UpdateProductRequest updateProductRequest) {
        return null;
    }

    @Override
    public DeleteProductResponse deleteProduct(DeleteProductRequest deleteProductRequest) {
        return null;
    }
}
