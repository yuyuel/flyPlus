package com.yyl.flyplus.mapper;

import com.yyl.flyplus.model.Placement;

public interface PlacementMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Placement record);

    int insertSelective(Placement record);

    Placement selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Placement record);

    int updateByPrimaryKey(Placement record);
}