package auctionSystem.Data.Models;


import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Document("Bids")
@Data
public class Bid {
    @Id
    private String id;
    private BigDecimal amount;
    private LocalDateTime bidDate = LocalDateTime.now();
    @DBRef
    private Auction auction;
    @DBRef
    private User user;
}
