package com.example.cookle.repository;

import com.example.cookle.entity.RecipesInstructions;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RecipesInstructionsRepository extends JpaRepository<RecipesInstructions, Long> {
}
