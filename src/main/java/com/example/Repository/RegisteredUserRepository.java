package com.example.Repository;

import com.example.Model.RegisteredUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RegisteredUserRepository extends JpaRepository<RegisteredUser, Long> {

    RegisteredUser findByUserName(String email, String password);
}