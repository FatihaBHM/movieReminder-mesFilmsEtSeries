package org.lafabrique_epita.exposition;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan(basePackages = "org.lafabrique_epita.Domain")
public class ExpositionApplication {

    public static void main(String[] args) {
        SpringApplication.run(ExpositionApplication.class, args);
    }

}
