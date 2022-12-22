-- liquibase formatted sql
-- changeset liquibase:1
create table client(
    id bigint not null,
    FIRST_NAME character varying(255),
    LAST_NAME character varying(255),
    EMAIL character varying(255) ,
    GENDER character varying(255) ,
    ADDRESS character varying(255) ,
    PHONE integer,
    USERS_ID bigint,
    primary key (id)
);

create table user_card(
    id bigint not null,
    CREATED_DATA timestamp without time zone,
    ACTIVE_STATUS boolean,
    LAST_UPDATED_DATA timestamp without time zone,
    client_id bigint,
    primary key(id),
    foreign key (client_id) references client (id) match simple
);

create table book_description(
    id bigint not null,
    TITLE character varying(255),
    AUTHOR character varying(255),
    GENRE integer,
    primary key (id)
);

create table book(
    id bigint not null,
    instance_id uuid,
    IS_USED boolean,
    CREATED_DATA timestamp without time zone,
    LAST_UPDATED_DATA timestamp without time zone,
    EXPIRATION_DATE timestamp without time zone,
    book_description_id bigint,
    users_card_id bigint,
    primary key (id),
    foreign key (book_description_id) references book_description (id) match simple,
    foreign key (users_card_id) references user_card (id) match simple
);