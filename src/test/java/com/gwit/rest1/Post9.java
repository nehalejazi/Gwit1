package com.gwit.rest1;

import com.gwit.pojos.SecondPojo;
import com.gwit.pojos.ThirdPojo;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;

public class Post9 {

    @Test
    public void posttest9(){
        ThirdPojo tp = new ThirdPojo("2020-01-01","2021-02-01");
        SecondPojo sp = new SecondPojo("Neheight","Browneight","199",true,tp,"Dinner");
        Response r3 = given().header("Content-Type", ContentType.JSON).log().all()
                .body(sp).post("https://restful-booker.herokuapp.com/booking");

        r3.prettyPrint();


    }
}
