CREATE TABLE alcohol (
                         id BIGSERIAL NOT NULL,
                         description VARCHAR(255),
                         name VARCHAR(255),
                         price NUMERIC(38,2),
                         PRIMARY KEY (id)
);

CREATE TABLE basket (
                        id BIGSERIAL NOT NULL,
                        name VARCHAR(255),
                        price NUMERIC(38,2),
                        PRIMARY KEY (id)
);

CREATE TABLE children_eat (
                              id BIGSERIAL NOT NULL,
                              description VARCHAR(255),
                              name VARCHAR(255),
                              price NUMERIC(38,2),
                              PRIMARY KEY (id)
);

CREATE TABLE coffee (
                        id BIGSERIAL NOT NULL,
                        description VARCHAR(255),
                        name VARCHAR(255),
                        price NUMERIC(38,2),
                        PRIMARY KEY (id)
);

CREATE TABLE dessert (
                         id BIGSERIAL NOT NULL,
                         description VARCHAR(255),
                         name VARCHAR(255),
                         price NUMERIC(38,2),
                         PRIMARY KEY (id)
);

CREATE TABLE pervie_bludo (
                              id BIGSERIAL NOT NULL,
                              description VARCHAR(255),
                              name VARCHAR(255),
                              price NUMERIC(38,2),
                              PRIMARY KEY (id)
);
