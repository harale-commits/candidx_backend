package com.candidx.portal.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.candidx.portal.dto.response.ApiResponseDTO;
import com.candidx.portal.dto.response.UserDTOResponse;
import com.candidx.portal.service.UserService;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/user")
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping
    public ResponseEntity<ApiResponseDTO<List<UserDTOResponse>>> getUser(@RequestParam(required = false) UUID userId) {

        List<UserDTOResponse> users = userService.getUsers(userId);
        return ResponseEntity.ok(new ApiResponseDTO<>(200, users, "data retrieved successfully"));
    }

}
