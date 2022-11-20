package com.gwit.rest1;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

import static io.restassured.RestAssured.*;

public class Post6 {

    @Test
    public void posttest6(){
        Map<String, Object> parentmap1 = new HashMap<>();
        parentmap1.put("firstname", "Nehsix");
        parentmap1.put("lastname", "Brownsix");
        parentmap1.put("totalprice", 119);
        parentmap1.put("depositpaid", true);

        Map<String,Object> childmap1 = new HashMap<>();
        childmap1.put("checkin","2021-01-01");
        childmap1.put("checkout","2021-01-01");

        parentmap1.put("bookingdates",childmap1);
        parentmap1.put("additionalneeds","Dinner");

        Response response = given().header("Content-Type", ContentType.JSON)
                .log().all().body(parentmap1).post("https://restful-booker.herokuapp.com/booking");

        response.prettyPrint();


    }
}
