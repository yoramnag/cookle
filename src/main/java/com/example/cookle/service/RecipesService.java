package com.example.cookle.service;

import com.example.cookle.entity.Recipes;
import com.example.cookle.repository.RecipesRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class RecipesService {

    private RecipesRepository recipesRepository;

    public List<Recipes> getalllRecipesList(){
        return recipesRepository.findAll();
    }

    public Optional<Recipes> searchRecipe(String keyword) {
        Optional<Recipes> recipesOptional = recipesRepository.searchRecipesByName(keyword);
        if (!recipesOptional.isPresent()){
            return null;
        }
        return recipesOptional;
    }
}
