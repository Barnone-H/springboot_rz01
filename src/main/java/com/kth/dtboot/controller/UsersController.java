package com.kth.dtboot.controller;

import com.kth.dtboot.dao.SysUserMapper;
import com.kth.dtboot.entity.SysUser;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class UsersController {

    @Resource
    private SysUserMapper sysUserMapper;

    @RequestMapping("/find")
    public SysUser findUser() {
       return sysUserMapper.selectByPrimaryKey(1L);
    }
}
