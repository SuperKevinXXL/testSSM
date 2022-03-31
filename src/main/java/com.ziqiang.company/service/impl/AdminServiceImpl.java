package com.ziqiang.company.service.impl;

import com.ziqiang.company.mapper.AdminMapper;
import com.ziqiang.company.pojo.Admin;
import com.ziqiang.company.pojo.AdminExample;
import com.ziqiang.company.service.AdminService;
import com.ziqiang.company.utils.MD5Util;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AdminServiceImpl implements AdminService {
    //在业务逻辑层，一定会有数据访问层的对象
    @Autowired
    AdminMapper adminMapper;

    @Override
    public Admin login(String name, String pwd) {
        AdminExample example = new AdminExample();
        example.createCriteria().andANameEqualTo(name);
        List<Admin> adminList =  adminMapper.selectByExample(example);
        if(adminList != null && adminList.size() > 0){
            Admin admin = adminList.get(0);
            if(admin.equals(MD5Util.getMD5(admin.getaPass()))){
                return admin;
            }else{
                return null;
            }
        }else{
            return null;
        }
    }
}
