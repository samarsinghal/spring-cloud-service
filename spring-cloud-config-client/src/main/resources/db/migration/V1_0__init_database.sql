CREATE TABLE city (
                    ID INTEGER PRIMARY KEY AUTO_INCREMENT,
                    NAME VARCHAR(100) NOT NULL,
                    COUNTY VARCHAR(100) NOT NULL,
                    STATE_CODE VARCHAR(10) NOT NULL,
                    POSTAL_CODE VARCHAR(10) NOT NULL,
                    LATITUDE VARCHAR(15) NOT NULL,
                    LONGITUDE VARCHAR(15) NOT NULL
);