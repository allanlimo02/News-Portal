SET MODE PostgreSQL;


CREATE DATABASE news_portal;
\c news_portal;

CREATE TABLE department IF NOT EXISTS (id SERIAL PRIMARY KEY, department VARCHAR);
CREATE TABLE IF NOT EXISTS users (id SERIAL PRIMARY KEY, username VARCHAR, department INTEGER );
CREATE TABLE IF NOT EXISTS news (id SERIAL PRIMARY KEY, title VARCHAR, department_id INTEGER, news_type VARCHAR,news_details VARCHAR);
 CREATE DATABASE news_portal_test WITH TEMPLATE news_portal;