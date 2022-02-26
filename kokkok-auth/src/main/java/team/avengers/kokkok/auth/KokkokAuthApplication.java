package team.avengers.kokkok.auth;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.r2dbc.repository.config.EnableR2dbcRepositories;

@EnableR2dbcRepositories(basePackages = "*")
@SpringBootApplication
public class KokkokAuthApplication {
    public static void main(String[] args) {
        SpringApplication.run(KokkokAuthApplication.class, args);
    }
}
