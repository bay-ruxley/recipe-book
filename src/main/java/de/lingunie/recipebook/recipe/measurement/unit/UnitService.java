package de.lingunie.recipebook.recipe.measurement.unit;

import org.apache.catalina.connector.Response;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ExceptionHandler;

import jakarta.transaction.Transactional;
import jakarta.validation.ConstraintViolationException;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;

@Service
@Validated
@RequiredArgsConstructor
class UnitService {
    private final UnitRepository unitRepository;

    @Transactional
    UnitEntity create(
        @Valid final UnitCreationDto creationDto
    ) {
        final var entity = new UnitEntity(creationDto);
        return unitRepository.save(entity);
    }
}
