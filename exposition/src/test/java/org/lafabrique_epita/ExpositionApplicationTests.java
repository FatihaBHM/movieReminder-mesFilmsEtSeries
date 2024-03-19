package org.lafabrique_epita;

import org.junit.jupiter.api.Test;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootTest
@EnableJpaAuditing
@EntityScan(basePackages = "org.lafabrique_epita.domain.entities")
class ExpositionApplicationTests {

    @Test
    void contextLoads() {
    }

}
