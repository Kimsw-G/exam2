package com.koreait.spring2.dao;

import com.koreait.spring2.model.ApartmentInfoEntity;
import com.koreait.spring2.model.LocationCodeEntity;
import com.koreait.spring2.model.SearchDTO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface LocationCodeDAO {
    List<LocationCodeEntity> selectLocationCodeAll();
    int insertApartmentInfoAll(List<ApartmentInfoEntity> list);
    int selectIsExist(SearchDTO searchDTO);
    int selectInnerCodeByOuterCode(SearchDTO searchDTO);
    List<ApartmentInfoEntity> selectApartmentInfoAll(SearchDTO searchDTO);
}
