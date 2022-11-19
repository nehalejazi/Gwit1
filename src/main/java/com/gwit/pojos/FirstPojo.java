package com.gwit.pojos;

import com.fasterxml.jackson.annotation.JsonAutoDetect;

@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY)
public class FirstPojo {

    private String name;
    private String job;

    public FirstPojo(String name, String job){
        this.name = name;
        this.job = job;
    }
}
