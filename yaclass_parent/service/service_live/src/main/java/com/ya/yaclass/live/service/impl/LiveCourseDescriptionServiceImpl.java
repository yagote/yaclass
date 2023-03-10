package com.ya.yaclass.live.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.ya.yaclass.model.live.LiveCourseDescription;
import com.ya.yaclass.live.mapper.LiveCourseDescriptionMapper;
import com.ya.yaclass.live.service.LiveCourseDescriptionService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 课程简介 服务实现类
 * </p>
 *
 * @author yagote
 * @since 2023-03-08
 */
@Service
public class LiveCourseDescriptionServiceImpl extends ServiceImpl<LiveCourseDescriptionMapper, LiveCourseDescription> implements LiveCourseDescriptionService {

    //获取直播课程描述信息
    @Override
    public LiveCourseDescription getLiveCourseById(Long id) {
        LambdaQueryWrapper<LiveCourseDescription> wrapper = new LambdaQueryWrapper<>();
        wrapper.eq(LiveCourseDescription::getLiveCourseId,id);
        LiveCourseDescription liveCourseDescription = baseMapper.selectOne(wrapper);
        return liveCourseDescription;
    }
}
