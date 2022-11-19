package com.gwit.rest1;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.Map;

import  static io.restassured.RestAssured.*;

public class Post5 {

    @Test
    public void postest5(){

        Map<String,Object> map1 = new HashMap<>();
        map1.put("name","yus2");
        map1.put("job","tester2");

        Response r1 = given().header("Content-Type", ContentType.JSON)
                .log().all().body(map1).post("https://reqres.in/api/users");
        System.out.println(r1.getStatusCode());
        r1.prettyPrint();

    }
}
