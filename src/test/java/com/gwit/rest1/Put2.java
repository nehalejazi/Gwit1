package com.gwit.rest1;
import com.gwit.pojos.SecondPojo;
import com.gwit.pojos.ThirdPojo;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;

public class Put2 {

    @Test
    public void puttest2(){

        ThirdPojo tp = new ThirdPojo("2020-01-01","2021-01-01");
        SecondPojo sp2 = new SecondPojo("Nehsixteenupdatd","Brownsixteenupdated","112",true,tp,"Breakfast");

        Response r6 = given()
                .header("Content-Type", ContentType.JSON)
                .header("Accept", "application/json")
                .header("Cookie", "token=891428d37f69a92")
                .pathParam("id", 2082)
                .log()
                .all()
                .body(sp2)
                .put("https://restful-booker.herokuapp.com/booking/{id}");

        r6.prettyPrint();
        System.out.println(r6.getStatusCode());


    }
}
