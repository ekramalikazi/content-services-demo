package com.mycms.legacy.client.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mycms.legacy.client.domain.User;

public interface UserRepository extends JpaRepository<User, String> {
}
