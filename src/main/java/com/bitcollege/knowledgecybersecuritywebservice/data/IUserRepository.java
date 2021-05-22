package com.bitcollege.knowledgecybersecuritywebservice.data;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bitcollege.knowledgecybersecuritywebservice.entity.User;

@Repository
public interface IUserRepository extends JpaRepository<User, Long> {

	public User findByEmail(String email);
	
}