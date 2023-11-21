set search_path TO recipe_book, public;

create table ingredient (
    id      smallserial
            primary key,
    name    character varying(50)
            unique
            not null
)

create table unit (
    id              smallserial
                    primary key,
    name            character varying(30)
                    not null
                    unique,
    abbreviation    character varying(5)
                    not null
                    unique
)

create table measurement (
    ingredient_id   smallint
                    not null
                    references ingredient (id),
    unit_id         smallint
                    not null
                    references unit (id)
    amount          real
                    not null,
    primary key (ingredient_id, unit_id)
);

create table food (
    id      smallserial
            primary key
            not null,
    name    character varying(50)
            not null
            unique
)

create table recipe (
    id              smallserial
                    primary key,
    instructions    text
                    not null,
    food_id         smallint
                    not null
                    references food (id),
)