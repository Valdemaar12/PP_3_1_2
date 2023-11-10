package ru.bogomolov.springbootapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.bogomolov.springbootapp.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
