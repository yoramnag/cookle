-- Insert sample recipes
INSERT INTO recipes (id, name, yield) VALUES (1, 'Chocolate Cake', 4);
INSERT INTO recipes (id, name, yield) VALUES (2, 'Pasta Alfredo', 2);
INSERT INTO recipes (id, name, yield) VALUES (3, 'Grilled Chicken', 3);

-- Insert sample ingredients
INSERT INTO ingredients (id, name, amount) VALUES (1, 'Flour', 500);
INSERT INTO ingredients (id, name, amount) VALUES (2, 'Sugar', 200);
INSERT INTO ingredients (id, name, amount) VALUES (3, 'Eggs', 3);
INSERT INTO ingredients (id, name, amount) VALUES (4, 'Milk', 250);
INSERT INTO ingredients (id, name, amount) VALUES (5, 'Chicken Breast', 2);

-- Insert into recipes_ingredient (Many-to-Many Relationship)
INSERT INTO recipes_ingredient (recipe_id, ingredient_id) VALUES (1, 1); -- Chocolate Cake - Flour
INSERT INTO recipes_ingredient (recipe_id, ingredient_id) VALUES (1, 2); -- Chocolate Cake - Sugar
INSERT INTO recipes_ingredient (recipe_id, ingredient_id) VALUES (1, 3); -- Chocolate Cake - Eggs
INSERT INTO recipes_ingredient (recipe_id, ingredient_id) VALUES (2, 4); -- Pasta Alfredo - Milk
INSERT INTO recipes_ingredient (recipe_id, ingredient_id) VALUES (3, 5); -- Grilled Chicken - Chicken Breast

-- Insert sample instructions (One-to-Many Relationship)
INSERT INTO instructions (id, description, recipe_id) VALUES (1, 'Preheat oven to 180°C.', 1);
INSERT INTO instructions (id, description, recipe_id) VALUES (2, 'Mix flour, sugar, and eggs.', 1);
INSERT INTO instructions (id, description, recipe_id) VALUES (3, 'Bake for 30 minutes.', 1);
INSERT INTO instructions (id, description, recipe_id) VALUES (4, 'Boil pasta and add milk.', 2);
INSERT INTO instructions (id, description, recipe_id) VALUES (5, 'Grill chicken for 15 minutes.', 3);
