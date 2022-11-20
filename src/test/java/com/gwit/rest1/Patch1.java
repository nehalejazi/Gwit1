package com.gwit.rest1;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.Map;
import static io.restassured.RestAssured.*;


public class Patch1 {

    @Test
    public void patchtest1(){

        Map<String,Object> map1 = new HashMap<>();
        map1.put("firstname","nehalpatched");
        map1.put("lastname","Brownpatched");

        Response r10 = given().header("Content-Type", ContentType.JSON)
                .header("Accept", "application/json")
                .header("Cookie", "token=891428d37f69a92")
                .pathParam("id", "2559")
                .log().all()
                .body(map1).patch("https://restful-booker.herokuapp.com/booking/{id}");

        r10.prettyPrint();
        System.out.println(r10.getStatusCode());


    }

}
