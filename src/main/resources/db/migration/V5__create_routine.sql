CREATE TABLE routines (
    id BIGSERIAL PRIMARY KEY,
    meal_name VARCHAR(100) NOT NULL,
    routine_at TIMESTAMP WITHOUT TIME ZONE NOT NULL,
    created_at TIMESTAMP WITHOUT TIME ZONE DEFAULT CURRENT_TIMESTAMP,
    updated_at TIMESTAMP WITHOUT TIME ZONE DEFAULT CURRENT_TIMESTAMP
);

CREATE TABLE routine_foods (
    routine_id BIGINT NOT NULL,
    food_id BIGINT NOT NULL,
    CONSTRAINT fk_routine_foods_routine
        FOREIGN KEY (routine_id) REFERENCES routines (id) ON DELETE CASCADE,
    CONSTRAINT fk_routine_foods_food
        FOREIGN KEY (food_id) REFERENCES ibge_foods2 (id) ON DELETE CASCADE
);

