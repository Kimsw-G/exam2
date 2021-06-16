package com.koreait.spring2.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class ApartmentInfoEntity {

    private int i_ai;
    @JsonProperty("거래금액")
    private int deal_amount;
    @JsonProperty("건축년도")
    private int build_year;
    @JsonProperty("년")
    private int deal_year;
    @JsonProperty("월")
    private int deal_month;
    @JsonProperty("일")
    private int deal_day;
    @JsonProperty("법정동")
    private String dong;
    @JsonProperty("아파트")
    private String apartment_name;
    @JsonProperty("전용면적")
    private float area_for_exclusive_use;
    @JsonProperty("지번")
    private String jibun;
    @JsonProperty("층")
    private int flr;
    private int location_cd;

    public void setDeal_amount(String deal_amount){
        this.deal_amount = Integer.parseInt(deal_amount.trim().replaceAll(",",""));
    }
}
