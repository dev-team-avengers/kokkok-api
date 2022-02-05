package team.avengers.kokkok.auth.entity;

import org.springframework.data.annotation.Id;

public record User(
        @Id
        Long id,
        String firstName,
        String lastName
) {
}
