package com.vinay.blog.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vinay.blog.entities.User;

public interface UserRepo extends JpaRepository<User,Integer>{

}
