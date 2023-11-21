package de.lingunie.recipebook.recipe.measurement.unit;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
interface UnitRepository extends CrudRepository<UnitEntity, Integer> {}
