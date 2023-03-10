package com.ya.yaclass.live.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.ya.yaclass.model.live.LiveCourseConfig;
import com.ya.yaclass.live.mapper.LiveCourseConfigMapper;
import com.ya.yaclass.live.service.LiveCourseConfigService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 直播课程配置表 服务实现类
 * </p>
 *
 * @author yagote
 * @since 2023-03-08
 */
@Service
public class LiveCourseConfigServiceImpl extends ServiceImpl<LiveCourseConfigMapper, LiveCourseConfig> implements LiveCourseConfigService {
    //根据课程id查询配置信息
    @Override
    public LiveCourseConfig getCourseConfigCourseId(Long liveCourseId) {
        return baseMapper.selectOne(new LambdaQueryWrapper<LiveCourseConfig>().eq(
                LiveCourseConfig::getLiveCourseId,
                liveCourseId));
    }
}
