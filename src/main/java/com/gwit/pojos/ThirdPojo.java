package com.gwit.pojos;

import com.fasterxml.jackson.annotation.JsonAutoDetect;

@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY)
public class ThirdPojo {

    public ThirdPojo(String checkin, String checkout) {
        this.checkin = checkin;
        this.checkout = checkout;
    }

    private String checkin;
    private String checkout;
}
