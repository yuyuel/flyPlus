package com.yyl.flyplus.mapper;

import com.yyl.flyplus.model.Actions;

public interface ActionsMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Actions record);

    int insertSelective(Actions record);

    Actions selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Actions record);

    int updateByPrimaryKey(Actions record);
}