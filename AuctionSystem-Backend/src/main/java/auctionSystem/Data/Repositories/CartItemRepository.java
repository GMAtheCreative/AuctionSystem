package auctionSystem.Data.Repositories;

import auctionSystem.Data.Models.CartItem;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface CartItemRepository extends MongoRepository<CartItem, String> {
}
