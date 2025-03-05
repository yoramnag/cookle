package com.example.cookle.rest;

import com.example.cookle.entity.Recipes;
import com.example.cookle.service.RecipesService;
import lombok.AllArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path = "/api" , produces = MediaType.APPLICATION_JSON_VALUE)
@AllArgsConstructor
public class RecipesRestController {

    private RecipesService recipesService;

    @GetMapping("/getAllRecipes")
    public List<Recipes> getAllRecipes(){
        return recipesService.getalllRecipesList();
    }

    @GetMapping("/searchRecipe")
    public Optional<Recipes> searchRecipe(@RequestParam String keyword){
        Optional<Recipes> recipesOptional = recipesService.searchRecipe(keyword);
        return recipesOptional;
    }
}
