package auctionSystem.Data.Models;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document("Users")
@Data
public class User {
    @Id
    private String id;
    private String username;
    private String password;
    private String email;
    private String phone;
    private String address;
    private Cart cart;
    @DBRef
    private List<Auction> auctions;
    @DBRef
    private List<Bid> bids;

}
