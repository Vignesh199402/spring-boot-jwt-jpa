package com.javainuse.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.javainuse.model.DAOUser;

@Service
@Repository
public interface UserDao extends JpaRepository<DAOUser, Integer> {
	
	DAOUser findByClientId(String clientId);
	
}