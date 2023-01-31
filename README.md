# kotlin-spring-boot-rest-api
Kotlin Spring Boot REST API

From: https://www.callicoder.com/kotlin-spring-boot-mysql-jpa-hibernate-rest-api-tutorial/

Shows how to build a REST API with Kotlin and Spring Boot.

It retrieves articles n and uses a MySQL as database, with JPA and Hibernate to access data from the database.

# Installing MySQL / MariaDB an Debian

As root do:

```bash
# apt-get install mariadb-client mariadb-server
```

## Create articles database

As root do:

```bash
# mysqladmin -u root -p create articles
```

The password is empty

## Connect to MariaDB:

```bash
# mysql
```

## Show databases

```
MariaDB [(none)]> show databases;
```

## Use articles database

```
MariaDB [(none)]> use articles;
```

The following prompt should be showed after that:

```
MariaDB [articles]>
```

## Create user for the dbplayer database:

```bash
$ mysql -u root -p 
```

Then do

```
MariaDB [(none)]> CREATE user 'articles' IDENTIFIED BY 'db_password';
Query OK, 0 rows affected (0.595 sec)
```

db_password should be a secure password for the articles user.

## Grant access to the articles database

As root do:

```
myql
MariaDB [(none)]> GRANT ALL ON articles.* TO 'articles' IDENTIFIED BY 'db_password';
```

# Using the app

```bash
$ mvn spring-boot:run
```

## Create a player

```bash
curl -i -H "Content-Type: application/json" -X POST \
-d '{"title": "How to learn Spring framework", "content": "Resources to learn Spring framework"}' \
http://localhost:8080/api/articles
```