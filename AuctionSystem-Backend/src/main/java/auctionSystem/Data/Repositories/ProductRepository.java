package auctionSystem.Data.Repositories;

import auctionSystem.Data.Models.Product;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProductRepository extends MongoRepository<Product, String> {
}
