package de.lingunie.recipebook.food;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
interface FoodRepository extends CrudRepository<FoodEntity, Integer> {}
