package com.example.user.repostirory;

import com.example.user.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepostirory extends JpaRepository<User, Integer> {
}
