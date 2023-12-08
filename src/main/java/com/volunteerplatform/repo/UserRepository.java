package com.volunteerplatform.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.volunteerplatform.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

}
