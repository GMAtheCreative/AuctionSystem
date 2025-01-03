package auctionSystem.Services;

public interface ProductServices {
    List<GetAllProductResponse> getAllProducts();
    List<PoductResponseByCategory> getProductsByCategory(PoductRequestByCategory productRequestByCategory);

}
