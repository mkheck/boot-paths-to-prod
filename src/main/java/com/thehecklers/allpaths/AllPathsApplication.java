package com.thehecklers.allpaths;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;

@SpringBootApplication
public class AllPathsApplication {

    public static void main(String[] args) {
        SpringApplication.run(AllPathsApplication.class, args);
    }

}

@RestController
class AllPathsController {
    private final Random rnd = new Random();

    @GetMapping
    public String livenessCheck() {
        return "All Paths app is alive and well!";
    }

    @GetMapping("/randomizer")
    public int getRandomNumber() {
		return rnd.nextInt(1000);
    }
}