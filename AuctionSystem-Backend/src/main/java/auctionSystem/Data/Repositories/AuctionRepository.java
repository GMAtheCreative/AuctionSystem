package auctionSystem.Data.Repositories;

import auctionSystem.Data.Models.Auction;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface AuctionRepository extends MongoRepository<Auction, String> {
}
