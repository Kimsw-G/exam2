package com.koreait.spring2.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class SearchDTO {
    private int deal_year;
    private int deal_month;
    private int outer_code;
    private int inner_code;
}
