package com.example;

import org.junit.jupiter.api.Test;
import static org.hamcrest.Matchers.*;
import static io.restassured.RestAssured.given;


class ApplicationTest {


    @Test
 public void verifyStatusCode() 
 { given().when().get("https://jsonplaceholder.typicode.com/posts/1").then().statusCode(200); 

 } 


 @Test
 public void Ejercicio2SolicitudGET(){
 given()
 .when().get("https://jsonplaceholder.typicode.com/posts/1").then()
 .body("userId", equalTo(1));
 }


 @Test
 public void Ejercicio3VerCabecera(){
    given().when().get("https://jsonplaceholder.typicode.com/posts/1").then().header("Content-Type", "application/json; charset=utf-8");

 }


 @Test
 public void Ejercicio4Post(){
   
    given().contentType("application/json").body("{\"title\": \"foo\", \"body\": \"bar\", \"userId\": 2}").when()
    .post("https://jsonplaceholder.typicode.com/posts").then().statusCode(201) //Crea
    .body("title", equalTo("foo")) //verificacion
    .body("body", equalTo("bar")) 
    .body("userId", equalTo(2));

 }


 @Test
 public void Ejercicio5(){
 given().when().get("https://jsonplaceholder.typicode.com/comments/5").then().statusCode(200);
 }


 @Test
 public void Ejercio6(){
 given().when().get("https://jsonplaceholder.typicode.com/todos").then()
 .body("userId[0]", equalTo(1));
 }

 @Test
 public void Ejercio7(){

    given().when().get("https://jsonplaceholder.typicode.com/posts?userId=1").then().statusCode(200)
    .body("userId.size()", greaterThan(5)); // Verifica que el tamaño de la lista de posts sea mayor que 5

 }

}
