package team.avengers.kokkok.auth.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;

import java.time.LocalDateTime;

public record User(
        @Id Long seq,
        @Column String id,
        @Column String password,
        @Column String nickname,
        @Column Boolean isVerifiedEmail,
        @Column String email,
        @Column String phoneNumber,
        @Column Integer joinType,
        @Column Integer userType,
        @Column LocalDateTime createDate,
        @Column LocalDateTime modifyDate,
        @Column LocalDateTime lastLoginDate,
        @Column LocalDateTime joinDate,
        @Column LocalDateTime leaveDate
        ) {
}
