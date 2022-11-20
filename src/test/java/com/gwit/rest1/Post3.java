package com.gwit.rest1;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.testng.annotations.Test;

import java.io.File;

import static io.restassured.RestAssured.*;


public class Post3 {

    @Test
    public void posttest3(){
        Response response = given().header("Content-Type", ContentType.JSON)
                .log().all().body(new File(System.getProperty("user.dir") + "/request1.json"))
                .post("https://restful-booker.herokuapp.com/booking");
        response.prettyPrint();
    }
}
