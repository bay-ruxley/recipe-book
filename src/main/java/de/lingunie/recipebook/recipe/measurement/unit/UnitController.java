package de.lingunie.recipebook.recipe.measurement.unit;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("units")
@RequiredArgsConstructor
class UnitController {    
    private final UnitService unitService;

    @PutMapping
    public UnitEntity create(
        @RequestBody final UnitCreationDto unitCreationDto
    ) {
        return this.unitService.create(unitCreationDto);
    }
}
