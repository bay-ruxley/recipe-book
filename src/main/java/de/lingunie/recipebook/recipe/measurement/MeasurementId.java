package de.lingunie.recipebook.recipe.measurement;

import de.lingunie.recipebook.recipe.measurement.ingredient.IngredientEntity;
import de.lingunie.recipebook.recipe.measurement.unit.UnitEntity;
import java.io.Serializable;
import lombok.AccessLevel;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@EqualsAndHashCode
@NoArgsConstructor
@Getter(AccessLevel.PACKAGE)
@Setter(AccessLevel.PACKAGE)
class MeasurementId implements Serializable {
    private IngredientEntity ingredient;

    private UnitEntity unit;
}
