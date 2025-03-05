package com.example.cookle.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class Ingredients {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private int amount;

    @ManyToMany(cascade= {CascadeType.PERSIST, CascadeType.MERGE,
            CascadeType.DETACH, CascadeType.REFRESH})
    @JoinTable(
            name="recipes_ingredient",
            joinColumns=@JoinColumn(name="ingredient_id"),
            inverseJoinColumns=@JoinColumn(name="recipe_id")
    )
    @JsonBackReference
    private List<Recipes> recipesList = new ArrayList<>();
}
