package com.gwit.rest1;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;

public class Delete1 {

    @Test
    public void deletetest1(){

        Response r9 = given().header("Content-Type", ContentType.JSON)
                .header("Cookie", "token=891428d37f69a92")
                .pathParam("id", 2512).log().all()
                .delete("https://restful-booker.herokuapp.com/booking/{id}");
        System.out.println(r9.getStatusCode());
        r9.prettyPrint();

    }
}
