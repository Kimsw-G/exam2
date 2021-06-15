package com.koreait.spring2.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class LocationCodeEntity {
    private int inner_code;
    private int outer_code;
    private String location;
}
