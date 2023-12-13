package com.Andile.jeweler.dao;

import com.Andile.jeweler.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserDao extends JpaRepository<User, Integer> {
}
