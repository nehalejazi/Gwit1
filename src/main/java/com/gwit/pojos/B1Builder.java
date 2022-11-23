package com.gwit.pojos;

import lombok.Setter;

@Setter
public class B1Builder {

    private String name;



    private String job;

    public B1Builder builder(){
        return this;
    }

    public B1 build(){
        return new B1(this.name,this.job);
    }

    public B1Builder setName(String name) {
        this.name = name;
        return this;
    }

    public B1Builder setJob(String job) {
        this.job = job;
        return this;
    }
}
