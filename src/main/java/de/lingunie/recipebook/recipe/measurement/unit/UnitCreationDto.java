package de.lingunie.recipebook.recipe.measurement.unit;

import jakarta.validation.constraints.NotBlank;

public record UnitCreationDto(
    @NotBlank(message = "You have to give me the name of the unit.")
    String name,
    @NotBlank(message = "I can't write that out all the time.")
    String abbreviation
) {}
