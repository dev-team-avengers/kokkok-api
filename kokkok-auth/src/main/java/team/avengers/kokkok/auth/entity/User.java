package team.avengers.kokkok.auth.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;

public record User(
        @Id Long seq,
        @Column String id

) {
}
