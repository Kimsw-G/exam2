package com.koreait.spring2.service;

import com.koreait.spring2.dao.LocationCodeDAO;
import com.koreait.spring2.model.LocationCodeEntity;
import com.koreait.spring2.model.SearchDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.*;
import org.springframework.http.converter.StringHttpMessageConverter;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponents;
import org.springframework.web.util.UriComponentsBuilder;

import java.net.URLDecoder;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.List;

@Service
public class ApartService {
    private static final String URL = "http://openapi.molit.go.kr/OpenAPI_ToolInstallPackage/service/rest/RTMSOBJSvc/getRTMSDataSvcAptTradeDev";
    private static final String TOKEN = "Y2UOCkD8Ilv2gViPGV33ddNTTQfRi92i8mRzUeQX%2BNgSiNTO3gp9hJZX4J6u8uXucMM6RdRBoGxMn6XHfsEzNA%3D%3D";
    private static final String LAWD_CD = "LAWD_CD";
    private static final String DEAL_YMD = "DEAL_YMD";
    private static final String SERVICE_KEY = "serviceKey";



    @Autowired
    LocationCodeDAO locationCodeDAO;

    public List<LocationCodeEntity> getAllInfo(){
        return locationCodeDAO.selectLocationCodeAll();
    }

    public static String getDecodeToken(){
        String decodeToken = null;

        try{
            decodeToken = URLDecoder.decode(TOKEN,"UTF-8");
        }catch (Exception e){
            e.printStackTrace();
        }
        return decodeToken;
    }

    public static <T> HttpEntity<T> setHeaders(){


        HttpHeaders headers = new HttpHeaders();
        headers.setAccept(Arrays.asList(MediaType.APPLICATION_XML));

        return new HttpEntity<>(headers);
    }

    public void saveData(SearchDTO searchDTO){
        HttpEntity<String> httpEntity = setHeaders();

        String deal_ym = String.format("%s%02d",searchDTO.getDeal_year(),searchDTO.getDeal_month());

        UriComponents builder = UriComponentsBuilder.fromHttpUrl(URL)
                .queryParam(LAWD_CD,searchDTO.getOuter_code())
                .queryParam(DEAL_YMD,deal_ym)
                .queryParam(SERVICE_KEY,getDecodeToken())
                .build(false);

        RestTemplate rest = new RestTemplate();
        rest.getMessageConverters().add(0,new StringHttpMessageConverter(Charset.forName("UTF-8")));

        ResponseEntity<String> responseEntity = rest.exchange(builder.toUriString(), HttpMethod.GET,httpEntity,String.class);

        System.out.println(responseEntity.getBody());
    }
}
