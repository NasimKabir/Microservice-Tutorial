package com.spring.usermanagement.repository;

import com.spring.usermanagement.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository< User,Long> {
}
