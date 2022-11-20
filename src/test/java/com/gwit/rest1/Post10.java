package com.gwit.rest1;

import com.gwit.pojos.FourthPojo;
import io.restassured.http.ContentType;
import io.restassured.module.jsv.JsonSchemaValidator;
import io.restassured.response.Response;
import org.testng.Assert;
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
        Assert.assertEquals(r4.getStatusCode(),201);
        //Assert.assertEquals(r4.header("Content-Type"),ContentType.JSON);
        //FourthPojo fp2 = r4.as(FourthPojo.class);
        //System.out.println(fp2.getJob());
        System.out.println(r4.jsonPath().getInt("id"));
        r4.then().body(JsonSchemaValidator.matchesJsonSchemaInClasspath("responseschema.json"));

    }
}
