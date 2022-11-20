package com.gwit.rest1;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;

public class Post1 {

    @Test
    public void posttest1(){
        Response response = given()
                .header("Content-Type", "application/json")
               // .header("Content-Type", ContentType.JSON)
                .body("{\n" +
                        "    \"firstname\" : \"Nehone\",\n" +
                        "    \"lastname\" : \"Brown\",\n" +
                        "    \"totalprice\" : 112,\n" +
                        "    \"depositpaid\" : true,\n" +
                        "    \"bookingdates\" : {\n" +
                        "        \"checkin\" : \"2020-01-01\",\n" +
                        "        \"checkout\" : \"2021-01-01\"\n" +
                        "    },\n" +
                        "    \"additionalneeds\" : \"Dinner\"\n" +
                        "}"

                ).log().all().post("https://restful-booker.herokuapp.com/booking");

        System.out.println(response.getStatusCode());
        response.prettyPrint();
    }


}
