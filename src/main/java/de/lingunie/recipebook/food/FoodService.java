package de.lingunie.recipebook.food;

import jakarta.transaction.Transactional;
import java.util.Collection;
import lombok.RequiredArgsConstructor;
import org.aspectj.lang.annotation.RequiredTypes;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class FoodService {
    private final FoodRepository foodRepository;

    public Iterable<FoodEntity> search() {
        return this.foodRepository.findAll();
    }

    @Transactional
    public FoodEntity create(
            // todo validation
            final String name
    ) {
        final var foodEntity = new FoodEntity(name);
        return this.foodRepository.save(foodEntity);
    }
}
