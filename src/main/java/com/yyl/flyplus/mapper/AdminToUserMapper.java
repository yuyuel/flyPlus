package com.yyl.flyplus.mapper;

import com.yyl.flyplus.model.AdminToUser;

public interface AdminToUserMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(AdminToUser record);

    int insertSelective(AdminToUser record);

    AdminToUser selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(AdminToUser record);

    int updateByPrimaryKey(AdminToUser record);
}