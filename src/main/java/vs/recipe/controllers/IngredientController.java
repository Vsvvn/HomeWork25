package vs.recipe.controllers;

import org.springframework.web.bind.annotation.*;
import vs.recipe.model.Ingredient;
import vs.recipe.service.impl.IngredientService;

@RestController
@RequestMapping("/ingredient")
public class IngredientController {

    private final IngredientService ingredientService;

    public IngredientController(IngredientService ingredientService) {
        this.ingredientService = ingredientService;
    }

    @GetMapping("{/id}")
    public Ingredient getIngredientId(@PathVariable Long id) {
        return ingredientService.getIngredient(id);
    }

    @PostMapping
    public Ingredient add(@RequestBody Ingredient ingredient) {

        return ingredientService.addNewIngredient(ingredient);
    }
}


