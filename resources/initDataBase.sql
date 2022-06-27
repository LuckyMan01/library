DROP TABLE IF EXISTS PUBLIC.BOOK;

CREATE TABLE PUBLIC.BOOK (
  ID integer NOT NULL GENERATED ALWAYS AS IDENTITY ( INCREMENT 1 START 1 MINVALUE 1 MAXVALUE 2147483647 CACHE 1 ),
  NAME_BOOK VARCHAR(255) NOT NULL,
  YEARS INTEGER NOT NULL,
  AUTHOR VARCHAR(255) NOT NULL,
  CONSTRAINT BOOK_DESCRIPTION PRIMARY KEY (ID)
);

CREATE TABLE PUBLIC.BOOK_DESCRIPTION (
  ID integer NOT NULL GENERATED ALWAYS AS IDENTITY ( INCREMENT 1 START 1 MINVALUE 1 MAXVALUE 2147483647 CACHE 1 ),
  GENRE VARCHAR(255) NOT NULL,
  BOOK_ID INTEGER NOT NULL UNIQUE,
  CONSTRAINT BOOK_DESCRIPTION_PRIMARY_KEY PRIMARY KEY (ID),
  CONSTRAINT BOOK_FOREIGN_KEY FOREIGN KEY (BOOK_ID) REFERENCES BOOK (ID)
);

CREATE TABLE PUBLIC.USER_TABLE(
  ID integer NOT NULL GENERATED ALWAYS AS IDENTITY ( INCREMENT 1 START 1 MINVALUE 1 MAXVALUE 2147483647 CACHE 1 ),
  LAST_NAME VARCHAR(255) NOT NULL,
  FIRST_NAME VARCHAR(255) NOT NULL,
  AGE INTEGER NOT NULL,
  ADRES_USER VARCHAR(255) NOT NULL,
  NUMBER_PHONE VARCHAR(255) NOT NULL,
  CONSTRAINT BOOK_DESCRIPTION PRIMARY KEY(ID)
);
CREATE TABLE PUBLIC.USER_DESCRIPTION(
  ID integer NOT NULL GENERATED ALWAYS AS IDENTITY ( INCREMENT 1 START 1 MINVALUE 1 MAXVALUE 2147483647 CACHE 1 ),
  USER_ID INTEGER NOT NULL UNIQUE,
  CONSTRAINT USER_DESCRIPTION_PRIMARY_KEY PRIMARY KEY (ID),
  ACTIVE BOOLEAN NOT NULL,
  CONSTRAINT USER_FOREIGN_KEY FOREIGN KEY (USER_ID) REFERENCES USER_TABLE (ID)

);