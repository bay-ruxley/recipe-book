package de.lingunie.recipebook;

import de.lingunie.recipebook.food.FoodService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DevSetup {
    @Bean
    CommandLineRunner run(
            final FoodService foodService
            ) {
        return args -> {
            foodService.create("Pizza");
            System.out.println(foodService.search());
        };
    }
}
