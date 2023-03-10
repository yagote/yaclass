package com.ya.yaclass.live.controller;


import com.ya.yaclass.model.user.UserInfo;
import com.ya.yaclass.live.service.UserInfoService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 * 用户表 前端控制器
 * </p>
 *
 * @author yagote
 * @since 2023-03-07
 */
@RestController
@RequestMapping("/admin/user/userInfo")
public class UserInfoController {

    @Autowired
    private UserInfoService userInfoService;

    @ApiOperation(value = "获取")
    @GetMapping("inner/getById/{id}")
    public UserInfo getById(@PathVariable Long id) {
        UserInfo userInfo = userInfoService.getById(id);
        return userInfo;
    }
}

