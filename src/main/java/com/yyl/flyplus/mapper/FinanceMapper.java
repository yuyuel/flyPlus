package com.yyl.flyplus.mapper;

import com.yyl.flyplus.model.Finance;

public interface FinanceMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Finance record);

    int insertSelective(Finance record);

    Finance selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Finance record);

    int updateByPrimaryKey(Finance record);
}