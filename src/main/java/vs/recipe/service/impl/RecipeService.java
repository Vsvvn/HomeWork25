package vs.recipe.service.impl;

import vs.recipe.model.Recipe;

public interface RecipeService {
    Recipe getRecipe(Long id);
    Recipe addNewRecipe(Recipe recipe);
}
