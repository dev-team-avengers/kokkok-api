package team.avengers.kokkok.auth;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.r2dbc.repository.config.EnableR2dbcRepositories;
import team.avengers.kokkok.auth.entity.User;
import team.avengers.kokkok.auth.repository.UserRepository;

import java.time.Duration;
import java.util.List;

@EnableR2dbcRepositories(basePackages = "*")
@SpringBootApplication
public class KokkokAuthApplication {
    private static final Logger log = LoggerFactory.getLogger(KokkokAuthApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(KokkokAuthApplication.class, args);
    }

    @Bean
    public CommandLineRunner demo(UserRepository userRepository) {

        return (args) -> {
            // save a few customers
            userRepository.saveAll(List.of(new User(null, "gil-dong", "hong"),
                            new User(null, "ji-min", "hong"),
                            new User(null, "young-sil", "jang")))
                    .blockLast(Duration.ofSeconds(10));

            // fetch all users
            log.info("User found with findAll():");
            log.info("-------------------------------");
            userRepository.findAll().doOnNext(customer -> log.info(customer.toString())).blockLast(Duration.ofSeconds(10));

            log.info("");

            // fetch an individual user by ID
            userRepository.findById(1L).doOnNext(customer -> {
                log.info("User found with findById(1L):");
                log.info("--------------------------------");
                log.info(customer.toString());
                log.info("");
            }).block(Duration.ofSeconds(10));


            // fetch user by last name
            log.info("User found with findByLastName('hong'):");
            log.info("--------------------------------------------");
            userRepository.findByLastName("hong").doOnNext(hong -> log.info(hong.toString())).blockLast(Duration.ofSeconds(10));;
            log.info("");
        };
    }
}
