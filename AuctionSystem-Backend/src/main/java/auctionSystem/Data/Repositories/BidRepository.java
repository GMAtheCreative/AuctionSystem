package auctionSystem.Data.Repositories;

import auctionSystem.Data.Models.Bid;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface BidRepository extends MongoRepository<Bid, String> {
}
