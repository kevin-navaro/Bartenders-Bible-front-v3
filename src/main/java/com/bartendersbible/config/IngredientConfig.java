package com.bartendersbible.config;

import com.bartendersbible.entities.Ingredients;
import com.bartendersbible.repositories.IngredientsRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class IngredientConfig {

    @Bean
    CommandLineRunner commandLineRunner(IngredientsRepository ingredientsRepository) {
        return args -> {
            Ingredients i = new Ingredients();
            i.setHasAlcohol(true);
            i.setName("Vodka");
            i.setImage("https://cdn.selection-prestige.de/media/catalog/product/cache/image/1536x/a4e40ebdc3e371adff845072e1c73f37/9/9/99033_absolut-vodka-1L-40-vol.jpg");
            ingredientsRepository.save(i);

            i = new Ingredients();
            i.setHasAlcohol(false);
            i.setName("Coca Cola");
            i.setImage("https://www.charlemagne-boissons.com/3149-large_default/coca-cola.jpg");
            ingredientsRepository.save(i);
        };
    }
}
