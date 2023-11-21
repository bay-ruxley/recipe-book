package de.lingunie.recipebook.recipe;

import de.lingunie.recipebook.food.FoodEntity;
import de.lingunie.recipebook.recipe.measurement.MeasurementEntity;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import java.util.Collection;
import java.util.Set;
import lombok.AccessLevel;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@NoArgsConstructor
@Getter(AccessLevel.PACKAGE)
@Setter(AccessLevel.PACKAGE)
public class RecipeEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String instructions;

    @ManyToOne
    private FoodEntity food;

    @OneToMany
    private Collection<MeasurementEntity> measurements;

    RecipeEntity(
            final String instructions,
            final FoodEntity food,
            final Collection<MeasurementEntity> measurements
    ) {
        this.instructions = instructions;
        this.food = food;
        this.measurements = measurements;
    }
}
