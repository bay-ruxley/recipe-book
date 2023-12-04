package de.lingunie.recipebook.recipe.measurement.unit;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@NoArgsConstructor
@Table(name = "unit")
@Getter(AccessLevel.PACKAGE)
@Setter(AccessLevel.PACKAGE)
public class UnitEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String name;
    private String abbreviation;

    UnitEntity(
            final String name,
            final String abbreviation
    ) {
        this.name = name;
        this.abbreviation = abbreviation;
    }

    UnitEntity(final UnitCreationDto unitCreationDto) {
        this(unitCreationDto.name(), unitCreationDto.abbreviation());
    }
}
