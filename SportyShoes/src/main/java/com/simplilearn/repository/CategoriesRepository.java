package com.simplilearn.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.simplilearn.entity.Categories;

@Repository
public interface CategoriesRepository extends JpaRepository<Categories, Long> {

}

