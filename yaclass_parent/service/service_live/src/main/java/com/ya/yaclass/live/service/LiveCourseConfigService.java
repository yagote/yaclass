package com.ya.yaclass.live.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.ya.yaclass.model.live.LiveCourseConfig;

/**
 * <p>
 * 直播课程配置表 服务类
 * </p>
 *
 * @author yagote
 * @since 2023-03-08
 */
public interface LiveCourseConfigService extends IService<LiveCourseConfig> {
    //根据课程id查询配置信息
    LiveCourseConfig getCourseConfigCourseId(Long id);
}
