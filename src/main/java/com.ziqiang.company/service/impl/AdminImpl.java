package com.ziqiang.company.service.impl;

import com.ziqiang.company.mapper.AdminMapper;
import com.ziqiang.company.pojo.Admin;
import com.ziqiang.company.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AdminImpl implements AdminService {
    //在业务逻辑层，一定会有数据访问层的对象
    @Autowired
    AdminMapper adminMapper;

    @Override
    public Admin loging(String name, String pwd) {


        return null;
    }
}
