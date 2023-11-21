package de.lingunie.recipebook.recipe.measurement;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
interface MeasurementRepository extends CrudRepository<MeasurementEntity, Long> {}
