package com.candidx.portal.service;

import org.springframework.stereotype.Service;
import com.candidx.portal.model.UserModel;
import com.candidx.portal.repository.UserRepository;
import com.candidx.portal.dto.response.UserDTOResponse;
import java.util.List;
import java.util.UUID;

@Service
public class UserService {

    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public List<UserDTOResponse> getUsers(UUID userId) {

        List<UserModel> users = userRepository.findByUserId(userId);

        return users.stream().map(user -> {

            UserDTOResponse userDTOResponse = new UserDTOResponse(null, null, 0, false, null, null);

            userDTOResponse.setUserId(user.getUserId());
            userDTOResponse.setUserName(user.getUserName());
            userDTOResponse.setState(user.getState());
            userDTOResponse.setPinCode(user.getPinCode());
            userDTOResponse.setCreatedAt(user.getCreatedAt());

            return userDTOResponse;

        }).toList();

    }

}
