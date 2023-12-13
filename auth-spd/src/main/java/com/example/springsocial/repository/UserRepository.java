package com.example.springsocial.repository;

import com.example.springsocial.model.AuthProvider;
import com.example.springsocial.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    Optional<User> findByEmailAndProviderEquals(String email, AuthProvider provider);

    Boolean existsByEmail(String email);

}
