package vs.recipe.controllers;

import org.springframework.web.bind.annotation.*;
import vs.recipe.model.Recipe;
import vs.recipe.service.impl.RecipeService;

@RestController
@RequestMapping("/recipe")
public class RecipeController {

    private final RecipeService recipeService;

    public RecipeController(RecipeService recipeService) {
        this.recipeService = recipeService;
    }

    @GetMapping("/{id}")
    public Recipe getRecipeId(@PathVariable Long id) {
        return recipeService.getRecipe(id);
    }

    @PostMapping
    public Recipe add(@RequestBody Recipe recipe) {

        return recipeService.addNewRecipe(recipe);
    }
}
