package com.yyl.flyplus.mapper;

import com.yyl.flyplus.model.HomeToUser;

public interface HomeToUserMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(HomeToUser record);

    int insertSelective(HomeToUser record);

    HomeToUser selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(HomeToUser record);

    int updateByPrimaryKey(HomeToUser record);
}