package de.lingunie.recipebook.recipe.measurement.ingredient;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.core.annotation.Order;

@Entity
@NoArgsConstructor
@Table(name = "ingredient")
@Getter(AccessLevel.PACKAGE)
@Setter(AccessLevel.PACKAGE)
public class IngredientEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String name;

    IngredientEntity(final String name) {
        this.name = name;
    }
}

