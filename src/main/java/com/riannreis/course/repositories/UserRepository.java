package com.riannreis.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.riannreis.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
