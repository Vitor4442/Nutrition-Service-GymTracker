CREATE TABLE ibge_foods (
                            id BIGSERIAL PRIMARY KEY,

                            food_code INTEGER,
                            food_description VARCHAR(150),
                            category VARCHAR(100),

                            preparation_code INTEGER,
                            preparation_description VARCHAR(150),

    -- Macronutrientes
                            energy_kcal NUMERIC(10,2),
                            protein_g NUMERIC(10,2),
                            total_fat_g NUMERIC(10,2),
                            carbohydrates_g NUMERIC(10,2),
                            total_fiber_g NUMERIC(10,2),
                            total_sugars_g NUMERIC(10,2),
                            added_sugars_g NUMERIC(10,2),

    -- Lipídios detalhados
                            cholesterol_mg NUMERIC(10,2),
                            saturated_fat_g NUMERIC(10,2),
                            monounsaturated_fat_g NUMERIC(10,2),
                            polyunsaturated_fat_g NUMERIC(10,2),
                            linoleic_acid_g NUMERIC(10,2),
                            linolenic_acid_g NUMERIC(10,2),
                            trans_fat_g NUMERIC(10,2),

    -- Minerais
                            calcium_mg NUMERIC(10,2),
                            magnesium_mg NUMERIC(10,2),
                            manganese_mg NUMERIC(10,2),
                            phosphorus_mg NUMERIC(10,2),
                            iron_mg NUMERIC(10,2),
                            sodium_mg NUMERIC(10,2),
                            added_sodium_mg NUMERIC(10,2),
                            potassium_mg NUMERIC(10,2),
                            copper_mg NUMERIC(10,2),
                            zinc_mg NUMERIC(10,2),
                            selenium_mcg NUMERIC(10,2),

    -- Vitaminas
                            retinol_mcg NUMERIC(10,2),
                            vitamin_a_rae_mcg NUMERIC(10,2),
                            thiamine_mg NUMERIC(10,2),
                            riboflavin_mg NUMERIC(10,2),
                            niacin_mg NUMERIC(10,2),
                            niacin_ne_mg NUMERIC(10,2),
                            vitamin_b6_mg NUMERIC(10,2),
                            vitamin_b12_mcg NUMERIC(10,2),
                            folate_dfe_mcg NUMERIC(10,2),
                            vitamin_d_mcg NUMERIC(10,2),
                            vitamin_e_mg NUMERIC(10,2),
                            vitamin_c_mg NUMERIC(10,2),

                            slug VARCHAR(255) UNIQUE,

                            created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
                            updated_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);