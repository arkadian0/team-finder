CREATE TABLE PERSON (
    ID int GENERATED ALWAYS AS IDENTITY,
    EMAIL varchar(255) UNIQUE NOT NULL,
    FIRST_NAME varchar(50) NOT NULL,
    LAST_NAME varchar(50) NOT NULL,
    GENDER varchar(5) NOT NULL,
    AGE smallint NOT NULL,
    DESCRIPTION varchar(255),
    TOWN_ID int NOT NULL,
    CONSTRAINT PK_PERSON PRIMARY KEY (ID)
);

CREATE TABLE TOWN(
    ID int GENERATED ALWAYS AS IDENTITY,
    NAME varchar(100) NOT NULL,
    COORDINATE_X varchar(50) NOT NULL,
    COORDINATE_Y varchar(50) NOT NULL,
    COUNTRY_ID int NOT NULL,
    CONSTRAINT PK_TOWN PRIMARY KEY (ID)
);

CREATE TABLE COUNTRY (
    ID int GENERATED ALWAYS AS IDENTITY,
    NAME varchar(100) NOT NULL,
    COORDINATE_X varchar(50) NOT NULL,
    COORDINATE_Y varchar(50) NOT NULL,
    CONSTRAINT PK_COUNTRY PRIMARY KEY (ID)
);


ALTER TABLE PERSON ADD CONSTRAINT FK_TOWN FOREIGN KEY (TOWN_ID) REFERENCES TOWN (ID);
ALTER TABLE TOWN ADD CONSTRAINT FK_COUNTRY FOREIGN KEY (COUNTRY_ID) REFERENCES COUNTRY (ID);