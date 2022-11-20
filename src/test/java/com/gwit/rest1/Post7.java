package com.gwit.rest1;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.json.JSONObject;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class Post7 {


    @Test
    public void posttest7(){

        JSONObject map1 = new JSONObject();
        map1.put("firstname", "Nehseven");
        map1.put("lastname", "Brownseven");
        map1.put("totalprice", 119);
        map1.put("depositpaid", true);

        JSONObject map2 = new JSONObject();
        map2.put("checkin","2021-01-01");
        map2.put("checkout","2021-01-01");

        map1.put("bookingdates",map2);
        map1.put("additionalneeds","Dinner");

        Response response = given().header("Content-Type", ContentType.JSON)
                .log().all().body(map1.toMap()).post("https://restful-booker.herokuapp.com/booking");

        response.prettyPrint();




    }
}
