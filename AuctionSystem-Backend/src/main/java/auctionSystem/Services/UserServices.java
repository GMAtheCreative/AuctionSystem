package auctionSystem.Services;

import auctionSystem.Dtos.requests.UserRequest;
import auctionSystem.Dtos.responses.UserResponse;

public interface UserServices {
    UserResponse deleteUser(UserRequest userRequest);
    UserResponse createUser(UserRequest userRequest);
    UserResponse updateUser(UserRequest userRequest);
}
