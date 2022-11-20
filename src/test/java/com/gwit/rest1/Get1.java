package com.gwit.rest1;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;


public class Get1 {

    @Test
    public void gettest1(){

        given().queryParam("id",2)
                .log().all().get("https://reqres.in/api/users").prettyPrint();

    }

}

