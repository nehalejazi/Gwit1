package com.gwit.pojos;

import com.fasterxml.jackson.annotation.JsonAutoDetect;

@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY)
public class SecondPojo {

    public SecondPojo(String firstname, String lastname, String totalprice, boolean depositpaid, ThirdPojo bookingdates, String additionalneeds) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.totalprice = totalprice;
        this.depositpaid = depositpaid;
        this.bookingdates = bookingdates;
        this.additionalneeds = additionalneeds;
    }

    private String firstname;
    private String lastname;
    private String totalprice;
    private boolean depositpaid;
    private ThirdPojo bookingdates;
    private String additionalneeds;
}
