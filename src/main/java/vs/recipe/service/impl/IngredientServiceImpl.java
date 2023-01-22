package vs.recipe.service.impl;

import org.springframework.lang.Nullable;
import org.springframework.stereotype.Service;
import vs.recipe.model.Ingredient;

import java.util.Map;
import java.util.TreeMap;

@Service
public class IngredientServiceImpl implements IngredientService{

    private static long id = 1;
    private final Map<Long, Ingredient> ingredients = new TreeMap<>();

    public Ingredient addNewIngredient(Ingredient ingredient) {
       ingredients.put(id++, ingredient);
        return ingredient;
    }

    @Nullable
    public Ingredient getIngredient(Long id) {
     return ingredients.get(id);
    }
}
