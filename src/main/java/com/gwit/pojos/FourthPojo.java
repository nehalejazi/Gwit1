package com.gwit.pojos;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
//@JsonInclude(value = JsonInclude.Include.NON_NULL)
@JsonPropertyOrder(alphabetic = true)
//@JsonIgnoreProperties(value = {"job"})
public class FourthPojo {

    private String name;
    private String job;
}
