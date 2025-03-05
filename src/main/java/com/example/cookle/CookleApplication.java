package com.example.cookle;

import com.example.cookle.entity.Ingredients;
import com.example.cookle.entity.Recipes;
import com.example.cookle.entity.RecipesInstructions;
import com.example.cookle.repository.IngredientsRepository;
import com.example.cookle.repository.RecipesInstructionsRepository;
import com.example.cookle.repository.RecipesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class CookleApplication {

//	@Autowired
//	private RecipesRepository recipesRepository;
//
//	@Autowired
//	private IngredientsRepository ingredientsRepository;
//
//	@Autowired
//	private RecipesInstructionsRepository recipesInstructionsRepository;


	public static void main(String[] args)  {
		SpringApplication.run(CookleApplication.class, args);
	}

//	@Override
//	public void run(String... args){
//
//		recipesRepository.deleteAllInBatch();
//		ingredientsRepository.deleteAllInBatch();
//		recipesInstructionsRepository.deleteAllInBatch();
//
//		Recipes pasta = new Recipes();
//
//		pasta.setName("pasta");
//		pasta.setYield(2);
//		List<Ingredients> ingredientsList = new ArrayList<>();
//		Ingredients ingredient1 = new Ingredients();
//		ingredient1.setName("sea salt");
//		ingredient1.setAmount(5);
//		Ingredients ingredient2 = new Ingredients();
//		ingredient2.setName("dried pasta");
//		ingredient2.setAmount(75);
//		ingredientsList.add(ingredient1);
//		ingredientsList.add(ingredient2);
//		pasta.setIngredientsList(ingredientsList);
//		recipesRepository.save(pasta);
//		List<RecipesInstructions> recipesInstructionsList = new ArrayList<>();
//		RecipesInstructions instruction1 = new RecipesInstructions();
//		instruction1.setDescription("The first step is to make sure you have plenty of water in your pan. Use a large, high sided saucepan and add at least 500ml, or up to 1 litre of water per 100g dried pasta (depending on the capacity of your pan). Make sure there’s still enough room at the top because you don’t want the water to bubble up and overflow.");
//		recipesInstructionsList.add(instruction1);
//		pasta.setRecipesInstructionsList(recipesInstructionsList);
//		recipesRepository.save(pasta);
//	}

}
