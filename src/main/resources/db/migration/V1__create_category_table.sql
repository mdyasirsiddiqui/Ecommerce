CREATE TABLE category (
    -- From BaseEntity
    id BIGINT AUTO_INCREMENT NOT NULL,
    created_at DATETIME(6) NOT NULL,
    updated_at DATETIME(6) NOT NULL,

    -- From Category Entity
    name VARCHAR(255) NOT NULL,

    -- Constraints
    PRIMARY KEY (id),
    CONSTRAINT uk_category_name UNIQUE (name)
) ENGINE=InnoDB;
