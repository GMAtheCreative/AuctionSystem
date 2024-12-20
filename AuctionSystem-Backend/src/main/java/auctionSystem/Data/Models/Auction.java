package auctionSystem.Data.Models;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.math.BigDecimal;
import java.util.List;

@Document("Auctions")
@Data
public class Auction {
    @Id
    private String id;
    private String description;
    private BigDecimal startingPrice;
    @DBRef
    private Product product;
    @DBRef
    private User user;
    @DBRef
    private List<Bid> bid;
}
