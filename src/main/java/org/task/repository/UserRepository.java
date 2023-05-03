package org.task.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.task.model.User;

public interface UserRepository extends JpaRepository<User, Integer> {
}
