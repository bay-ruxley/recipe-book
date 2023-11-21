package de.lingunie.recipebook.recipe.measurement;

import de.lingunie.recipebook.recipe.measurement.ingredient.IngredientEntity;
import de.lingunie.recipebook.recipe.measurement.unit.UnitEntity;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.IdClass;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import java.math.BigDecimal;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@Entity
@NoArgsConstructor
@Table(name = "measurement")
@IdClass(MeasurementId.class)
public class MeasurementEntity {
    @EmbeddedId
    @ManyToOne
    private IngredientEntity ingredient;

    @EmbeddedId
    @ManyToOne
    private UnitEntity unit;

    private BigDecimal amount;

    MeasurementEntity(
            final IngredientEntity ingredient,
            final UnitEntity unit,
            final BigDecimal amount
    ) {
        this.ingredient = ingredient;
        this.unit = unit;
        this.amount = amount;
    }
}
