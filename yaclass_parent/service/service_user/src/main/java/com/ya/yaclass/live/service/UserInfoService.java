package com.ya.yaclass.live.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.ya.yaclass.model.user.UserInfo;

/**
 * <p>
 * 用户表 服务类
 * </p>
 *
 * @author yagote
 * @since 2023-03-07
 */
public interface UserInfoService extends IService<UserInfo> {
    //openid查询
    UserInfo getUserInfoOpenid(String openId);
}
