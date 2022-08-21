-- liquibase formatted sql
-- changeset liquibase:1
create table user_description
(
    id bigint not null,
    CREATE_DATA timestamp without time zone,
    ACTIVE_STATUS boolean,
    LAST_UPDATED_DATA timestamp without time zone,
    primary key(id)
);
create table application_users
(
    id bigint not null,
    FIRST_NAME character varying(255),
    LAST_NAME character varying(255),
    EMAIL character varying(255) ,
    GENDER character varying(255) ,
    ADDRESS character varying(255) ,
    PHONE integer,
    USERS_ID bigint,
    primary key (id),
    foreign key (USERS_ID) references user_description (id) match simple
);

create table book_description(
    id bigint not null,
    TITLE character varying(255),
    AUTHOR character varying(255),
    GENRE integer,
    BOOK_DESCRIPTION_ID bigint,
    primary key (id)
);
create table book(
    id bigint not null,
    NAME_BOOK character varying(255),
    NUMBER_UUID uuid,
    IS_USER boolean,
    CREATE_DATA timestamp without time zone,
    LAST_UPDATE_DATA timestamp without time zone,
    EXPIRATION_ID timestamp without time zone,
    book_description_id bigint,
    users_id bigint,
    primary key (id),
    foreign key (book_description_id) references book_description (id) match simple,
    foreign key (users_id) references application_users (id) match simple
);

