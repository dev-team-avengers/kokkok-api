CREATE TABLE `user` (
    seq BIGINT PRIMARY KEY AUTO_INCREMENT,
    id VARCHAR(30) NOT NULL UNIQUE,
    `password` VARCHAR(128),
    nickname VARCHAR(30) NOT NULL UNIQUE,
    is_verified_email CHAR(1) NOT NULL DEFAULT 'N',
    email VARCHAR(128),
    is_verified_phone_number CHAR(1) NOT NULL DEFAULT 'N',
    phone_number VARCHAR(128),
    join_type TINYINT(1),
    user_type TINYINT(1) NOT NULL,
    create_date DATETIME NOT NULL,
    modify_date DATETIME NOT NULL,
    last_login_at DATETIME NOT NULL,
    join_date DATETIME,
    leave_date DATETIME
)