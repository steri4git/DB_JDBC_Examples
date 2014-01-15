DROP TABLE PUBLIC.Person IF EXISTS;
CREATE TABLE PUBLIC.Person (
  Id INTEGER PRIMARY KEY,
  Vorname VARCHAR(20),
  Name VARCHAR(50),
  Alter INTEGER) ;
INSERT INTO Person VALUES(1,'Julia','Peterson-Clancy',16) ;
INSERT INTO Person VALUES(2,'Marcus','Meier',17) ;
INSERT INTO Person VALUES(3,'Stefan','Schulze',18) ;
INSERT INTO Person VALUES(4,'Kati','Müller',19) ;
