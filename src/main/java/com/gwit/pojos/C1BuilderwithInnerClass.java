package com.gwit.pojos;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@ToString
public class C1BuilderwithInnerClass {

    private String name;
    private String job;


    public static  class C1Builder{

        private String name;
        private String job;

        public static C1Builder builder(){
            return new C1Builder();
        }

        public C1Builder setName(String name){
            this.name = name;
            return this;
        }

        public C1Builder setJob(String job){
            this.job = job;
            return this;
        }
        public C1BuilderwithInnerClass build(){
            return new C1BuilderwithInnerClass(this.name,this.job);
        }
        public C1Builder and(){
            return this;
        }


    }
}
