package com.vinay.blog.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vinay.blog.entities.Category;

public interface CategoryRepo extends JpaRepository<Category,Integer>{
		

}
