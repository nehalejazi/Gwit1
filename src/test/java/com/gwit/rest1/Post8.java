package com.gwit.rest1;

import com.gwit.pojos.FirstPojo;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;

public class Post8 {

    @Test
    public void posttest8(){
        FirstPojo fp = new FirstPojo("yusthree","testthree");
        Response r2 = given().header("Content-Type", ContentType.JSON)
                .log().all().body(fp).post("https://reqres.in/api/users");

        System.out.println(r2.getStatusCode());
        r2.prettyPrint();


    }
}
