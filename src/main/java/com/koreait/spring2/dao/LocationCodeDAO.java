package com.koreait.spring2.dao;

import com.koreait.spring2.model.LocationCodeEntity;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface LocationCodeDAO {
    List<LocationCodeEntity> selectLocationCodeAll();
}
