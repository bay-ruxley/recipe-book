package de.lingunie.recipebook.recipe;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
interface RecipeRepository extends CrudRepository<RecipeEntity, Integer> {}
