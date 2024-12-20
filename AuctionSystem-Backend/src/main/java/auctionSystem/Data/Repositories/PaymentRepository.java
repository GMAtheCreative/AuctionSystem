package auctionSystem.Data.Repositories;

import auctionSystem.Data.Models.Payment;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface PaymentRepository extends MongoRepository<Payment, String> {
}
