package com.gwit.rest1;
import io.restassured.http.Header;
import io.restassured.http.Headers;
import io.restassured.response.Response;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

import static io.restassured.RestAssured.*;

public class Test1 {

    @Test
    public void restTest1(){
        Response response = given().get("https://restful-booker.herokuapp.com/booking/1623");
        System.out.println(response.getStatusCode());
        System.out.println(response.getTimeIn(TimeUnit.SECONDS));
        System.out.println(response.header("Content-Type"));
        Headers h = response.headers();
        for(Header h1:h){
            System.out.println(h1.getName()+"    "+h1.getValue());

        }
        response.prettyPrint();

    }
}
