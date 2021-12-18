package com.devspring.dscatolog.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.devspring.dscatolog.entities.Category;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Long>{

}
