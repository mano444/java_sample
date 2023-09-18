## Java Login App .. ## 

* check basic explanation of details of file hierarchy structure [File-hierachy](https://github.com/mano444/java_sample/wiki/File-_hierachy)  in sample java project 


## Sample Java Login application uses "UserDB" database and Table schema to store the Employee Login details. ##



## How to see list of Databases ##
SHOW DATABASES;

## How to create Database ##

CREATE DATABASE UserDB;

## How to list Tables ##

USE UserDB;

SHOW TABLES;

## How to create Table ##
## Below Query to create require TABLE schema to store Employee records ##

CREATE TABLE Employee (
  id int unsigned auto_increment not null,
  first_name varchar(250),
  last_name varchar(250),
  email varchar(250),
  username varchar(250),
  password varchar(250),
  regdate timestamp,
  primary key (id)
);

## List Table data ##
SELECT * FROM Employee;

## Describe Table schema ##
DESCRIBE Employee;
