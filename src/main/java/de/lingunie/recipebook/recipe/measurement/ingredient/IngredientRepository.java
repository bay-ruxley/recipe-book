package de.lingunie.recipebook.recipe.measurement.ingredient;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
interface IngredientRepository extends CrudRepository<IngredientEntity, Long> {}
