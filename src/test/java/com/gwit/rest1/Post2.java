package com.gwit.rest1;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;

public class Post2 {

    @Test
    public void posttest2(){
        String reqBody = "{\n" +
                "    \"firstname\" : \"Nehtwo\",\n" +
                "    \"lastname\" : \"Brown\",\n" +
                "    \"totalprice\" : 112,\n" +
                "    \"depositpaid\" : true,\n" +
                "    \"bookingdates\" : {\n" +
                "        \"checkin\" : \"2020-01-01\",\n" +
                "        \"checkout\" : \"2021-01-01\"\n" +
                "    },\n" +
                "    \"additionalneeds\" : \"Dinner\"\n" +
                "}";

        Response response = given().header("Content-Type", ContentType.JSON)
                .body(reqBody).log().all().post("https://restful-booker.herokuapp.com/booking");

        System.out.println(response.getStatusCode());
        response.prettyPrint();


    }

}
