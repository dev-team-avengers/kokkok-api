package team.avengers.kokkok.auth.repository;

import org.springframework.data.r2dbc.repository.R2dbcRepository;
import reactor.core.publisher.Flux;
import team.avengers.kokkok.auth.entity.User;

public interface UserRepository extends R2dbcRepository<User, Long> {
    Flux<User> findByLastName(String lastName);
}
