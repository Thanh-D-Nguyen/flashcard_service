package com.app.Flashcard;

import com.app.Flashcard.service.*;
import com.app.Flashcard.storage.StorageProperties;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;

@EnableConfigurationProperties(StorageProperties.class)
@SpringBootApplication
public class FlashcardApplication {

	public static void main(String[] args) {
		SpringApplication.run(FlashcardApplication.class, args);
	}

	@Bean
	CommandLineRunner init(StorageService storageService) {
		return (args) -> {
			storageService.deleteAll();
			storageService.init();
		};
	}

	@Bean
	CommandLineRunner runner(ExampleService exampleService,
							 GrammarService grammarService,
							 KanjiService kanjiService,
							 ViJaService viJaService,
							 JaViService jaViService) {
		return args -> {
			exampleService.insertAllExample();
//			grammarService.insertAllGrammar();
//			kanjiService.insertAllKanji();
//			viJaService.insertAllViJa();
//			jaViService.insertAllJaVi();
		};
	}
}
