package com.gwit.rest1;

import com.gwit.pojos.FourthPojo;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;

public class Post10 {

    @Test
    public void posttest10(){

        FourthPojo fourthPojo = new FourthPojo("Bhaibhai","testnine");

        Response r4 = given().header("Content-Type", ContentType.JSON)
                .log()
                .all()
                .body(fourthPojo).post("https://reqres.in/api/users");

        r4.prettyPrint();
        System.out.println(r4.getStatusCode());
    }
}
