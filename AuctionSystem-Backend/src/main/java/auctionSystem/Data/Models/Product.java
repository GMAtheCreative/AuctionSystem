package auctionSystem.Data.Models;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("Products")
@Data
public class Product {
    @Id
    private String id;
    private String name;
    private String description;
    private String imageUrl;
    @DBRef
    private Category category;
    @DBRef
    private Auction auction;
}
