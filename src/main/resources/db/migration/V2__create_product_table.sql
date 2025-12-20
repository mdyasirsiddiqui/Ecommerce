CREATE TABLE product (
    -- Fields inherited from BaseEntity
    id BIGINT AUTO_INCREMENT NOT NULL,
    created_at DATETIME(6) NOT NULL,
    updated_at DATETIME(6) NOT NULL,

    -- Fields from Product Entity
    title VARCHAR(255),
    price DOUBLE,
    description TEXT,
    image VARCHAR(255),
    category_id BIGINT NOT NULL,

    -- Constraints
    PRIMARY KEY (id),
    CONSTRAINT fk_product_category
        FOREIGN KEY (category_id)
        REFERENCES category (id)
        ON DELETE CASCADE
) ENGINE=InnoDB;
