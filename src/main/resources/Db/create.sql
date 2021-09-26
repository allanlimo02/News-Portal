SET MODE PostgreSQL;

--CREATE DATABASE news_portal;
--\c news_portal;

CREATE TABLE IF NOT EXISTS departments  (
    id  int PRIMARY KEY auto_increment,
    department_name VARCHAR
 );

CREATE TABLE IF NOT EXISTS users (id  int PRIMARY KEY auto_increment, username VARCHAR, department_id VARCHAR, role VARCHAR );

CREATE TABLE IF NOT EXISTS news (id  int PRIMARY KEY auto_increment, title VARCHAR, department_id INTEGER, category VARCHAR,news_details VARCHAR);

--CREATE DATABASE news_portal_test WITH TEMPLATE news_portal;