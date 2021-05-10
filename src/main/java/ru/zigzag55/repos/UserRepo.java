package ru.zigzag55.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.zigzag55.domain.User;

public interface UserRepo extends JpaRepository<User, Long> {
    User findByUsername(String username);
}
