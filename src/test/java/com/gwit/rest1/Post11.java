package com.gwit.rest1;

import com.gwit.pojos.B1;
import com.gwit.pojos.B1Builder;
import com.gwit.pojos.C1BuilderwithInnerClass;
import com.gwit.pojos.D1Builderwithlombok;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;

public class Post11 {
    //Test for Builder pattern usgae

    @Test
    public void posttest11(){

        B1 b1 = new B1Builder().builder().setName("Nehkk").setJob("Behkk").build();
        System.out.println(b1);
        B1 b2 = new B1Builder().builder().setName("Nehkktwo").build();
        System.out.println(b2);
        Response r5 = given().header("Content-Type", ContentType.JSON)
                .log()
                .all()
                .body(b1).post("https://reqres.in/api/users");

        r5.prettyPrint();
        Response r6 = given().header("Content-Type", ContentType.JSON)
                .log()
                .all()
                .body(b2).post("https://reqres.in/api/users");

        r6.prettyPrint();

    }

    @Test
    public void posttest12(){

        C1BuilderwithInnerClass c1 = C1BuilderwithInnerClass.C1Builder.builder().setName("Nehkkthree").setJob("Behkk").build();
        System.out.println(c1);
        C1BuilderwithInnerClass c2 = C1BuilderwithInnerClass.C1Builder.builder().setName("Nehkfour").build();
        System.out.println(c2);
        Response r5 = given().header("Content-Type", ContentType.JSON)
                .log()
                .all()
                .body(c1).post("https://reqres.in/api/users");

        r5.prettyPrint();
        Response r6 = given().header("Content-Type", ContentType.JSON)
                .log()
                .all()
                .body(c2).post("https://reqres.in/api/users");

        r6.prettyPrint();

    }

    @Test
    public void posttest13(){

        D1Builderwithlombok d1 = D1Builderwithlombok.builder().name("Nehhhhjjjjj").job("Hehejob").build();
        System.out.println(d1);

        Response r5 = given().header("Content-Type", ContentType.JSON)
                .log()
                .all()
                .body(d1).post("https://reqres.in/api/users");

        r5.prettyPrint();


    }
}
