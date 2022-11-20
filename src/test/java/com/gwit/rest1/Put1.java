package com.gwit.rest1;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.json.JSONObject;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;


public class Put1 {

    @Test
    public void puttest1(){

        JSONObject obj = new JSONObject();
        obj.put("name","anotherupdatedname");
        obj.put("job","anotherjob");

        Response r5 = given().header("Content-Type", ContentType.JSON)
                .pathParam("id", 2)
                .log()
                .all()
                .body(obj.toMap()).put("https://reqres.in/api/users/{id}");

        System.out.println(r5.getStatusCode());
        r5.prettyPrint();


    }
}
