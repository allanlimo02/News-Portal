# Project Name: News Portal


### Project Description
A Java/Spark application with a rest REST API for querying and retrieving scoped news and information. News, articles and posts are available to all users without navigating into any department, and others that are housed or classified within departments.



## Setup Instructions

* Install gradle.
* In the command prompt, navigate to cloned folder and use the following command to run the app `$ gradle run`
* Open the browser and enter the address `localhost:4567`

### DATABASE NAME
`\c newsportal;`
`\c newspotal_test;`

### CREATE  TABLES
* `nativage to main/resources/db  `
* `run  psql < create.sql`

### DROP  TABLES
* `nativage to main/resources/db  `
* `run  psql < drop.sql`


## Routes
| URL                                            | HTTP Verb   |                                 DESCRIPTION|
|--                                              |  ---        |                                   ---      |
|/users                                          |get          |     Get staff                              |
|/departments                                    |get          |     Get departments                        |
|/news/general                                   |get          |      get all news                          |
|/user/:id/departments                           |get          |      get users in a department             |
|/departments/:id/user                           |get          |     get depertments users                  |
|/depertment/:id                                 |get          |     get depertment using id                |
|/users/:id                                      | get         |     get users using id                     |
|/users/new                                      |post         |     add a new user                         |
|/departments/new                                |post         |     add a new department                   |
|/news/new/general                               |post         |     add news                               |
|/news/new/department                            |post         |    add news in department                  |
|/department/:id                                 |post         |    add department and give it an id        |
|/users/:id                                      |post         |    add user and give it an id              |

### Routes keywords

When creating objecs using postman, here are the samples to use
### users
```
{
    "username": "Allan",
    "department_id": 2,
     "role" :"Admin"
   
}
```
### Department
```
{
    "name":"Development"
}
```
### News
```
"title":"Delani Studio Collapse",
"department_id":3,
"category":"Departmental"'
"news_details":"Delani studio website has collapsed. This is due to poor development and deployment by all teams"

```

# Contact Information:
### Author: [Allan Limo](https://github.com/allanlimo02)

* Email: allanlimo02@gmail.com
* +254 726 832 007



### Technology Used
1. Java
2. HTML
3. CSS
4. Bootstrap



### Frameworks Used
1. Gradle
2. Spark
3. Maven
4. Junit
5. Handlebars

### LICENSE: [MIT LICENSE](https://github.com/allanlimo02/News-Portal/blob/master/LICENCE)