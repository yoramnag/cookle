package com.example.cookle.repository;

import com.example.cookle.entity.Recipes;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface RecipesRepository extends JpaRepository<Recipes, Long> {

    @Query("SELECT r FROM Recipes r WHERE LOWER(r.name) LIKE LOWER(CONCAT('%', :keyword, '%'))")
    Optional<Recipes> searchRecipesByName(@Param("keyword") String keyword);
}
