package com.licc.service.Impl;/*
 *
 *@create 2021-11-07-15:08
 */

import com.licc.dao.Role.RoleMapper;
import com.licc.pojo.Role;
import com.licc.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoleServiceImpl implements RoleService {
    //业务层调用dao层
    @Autowired
    private RoleMapper roleMapper;

//  使用注解模式开发：对应类上加 @Service 和 @Autowired 此时就不用set方法注入了
//    public void setRoleMapper(RoleMapper roleMapper) {
//        this.roleMapper = roleMapper;
//    }

    @Override
    public List<Role> getRoleList() {
        return roleMapper.getRoleList();
    }
}
