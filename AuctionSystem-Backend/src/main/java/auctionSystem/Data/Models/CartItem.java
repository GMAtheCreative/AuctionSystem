package auctionSystem.Data.Models;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("CartItem")
@Data
public class CartItem {
    @Id
    private String id;
    @DBRef
    private Cart cart;
    @DBRef
    private Product product;
}
