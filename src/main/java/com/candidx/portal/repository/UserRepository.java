package com.candidx.portal.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.candidx.portal.model.UserModel;
import java.util.List;

public interface UserRepository extends JpaRepository<UserModel, UUID> {

    List<UserModel> findByUserId(UUID userId);

}