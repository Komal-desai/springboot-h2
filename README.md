# springboot-h2
Spring boot project with H2 database

H2 Database Console url: http://localhost:8080/console

Put these details to connect to in memory database -

Settings Name: Generic H2

JDBC URL : jdbc:h2:mem:test

Driver   : org.h2.Driver

Username  : test

Passowrd  : test	


Rest service has these 3 operations -

POST : http://localhost:8080/movie/save 

Request Body :
{
	"name":"pqr",
	"rating":"10"
}

GET: http://localhost:8080/movie/{movieId}/rating

Response:
{
  "id": 1,
  "name": "pqr",
  "rating": 10
}


GET: http://localhost:8080/movie/all

Response:
{
  "id": 1,
  "name": "pqr",
  "rating": 10
},
{
  "id": 2,
  "name": "abc",
  "rating": 10
}


