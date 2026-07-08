package dev.douglasndm.learning_springboot.repositories;

import dev.douglasndm.learning_springboot.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
