package com.example.user.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.user.entity.SBUser;

@Repository
public interface UserRepo extends JpaRepository<SBUser, Long> {

	public SBUser findByUserId(Long userId);

}
