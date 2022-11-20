package com.gwit.rest1;

import com.github.javafaker.Faker;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.testng.annotations.Test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import static io.restassured.RestAssured.*;

public class Post4 {

    @Test
    public void posttest4() throws IOException {

        byte[] bytes = Files.readAllBytes(Paths.get(System.getProperty("user.dir") + "/request1.json"));
        String rbody = new String(bytes);
        String replace = rbody.replace("112",String.valueOf(new Faker().number().numberBetween(100,500)));

        Response response = given().header("Content-Type", ContentType.JSON)
                .log().all().body(replace).post("https://restful-booker.herokuapp.com/booking");

        response.prettyPrint();


    }
}
