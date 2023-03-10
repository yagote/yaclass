package com.ya.yaclass.live.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.ya.yaclass.model.user.UserInfo;
import com.ya.yaclass.live.mapper.UserInfoMapper;
import com.ya.yaclass.live.service.UserInfoService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 用户表 服务实现类
 * </p>
 *
 * @author yagote
 * @since 2023-03-07
 */
@Service
public class UserInfoServiceImpl extends ServiceImpl<UserInfoMapper, UserInfo> implements UserInfoService {

    //openid查询
    @Override
    public UserInfo getUserInfoOpenid(String openId) {
        QueryWrapper<UserInfo> wrapper = new QueryWrapper<>();
        wrapper.eq("open_id",openId);
        UserInfo userInfo = baseMapper.selectOne(wrapper);
        return userInfo;
    }
}

