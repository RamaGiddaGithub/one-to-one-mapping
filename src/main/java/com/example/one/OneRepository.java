package com.example.one;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.one.model.User;



public interface OneRepository extends JpaRepository<User,Integer>{

}
