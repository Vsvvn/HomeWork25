package vs.recipe.service.impl;


import org.springframework.lang.Nullable;
import org.springframework.stereotype.Service;
import vs.recipe.model.Recipe;

import java.util.Map;
import java.util.TreeMap;

@Service
public class RecipeServiceImpl implements RecipeService {
    private static long id = 1;
    private final Map<Long, Recipe> recipes = new TreeMap<>();


    public Recipe addNewRecipe(Recipe recipe) {
        recipes.put(id++, recipe);
        return recipe;
    }

    @Nullable
    public Recipe getRecipe(Long id) {
        return recipes.get(id);
    }

}
