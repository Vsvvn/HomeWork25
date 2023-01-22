package vs.recipe.service.impl;

import vs.recipe.model.Ingredient;

public interface IngredientService {
    Ingredient getIngredient(Long id);
    Ingredient addNewIngredient(Ingredient ingredient);
}
