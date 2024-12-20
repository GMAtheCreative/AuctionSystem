package auctionSystem.Data.Models;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document("Carts")
@Data
public class Cart {
    @Id
    private String id;
    @DBRef
    private User user;
    @DBRef
    private List<CartItem> cartItems;
}
