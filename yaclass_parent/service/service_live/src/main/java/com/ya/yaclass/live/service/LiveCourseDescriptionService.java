package com.ya.yaclass.live.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.ya.yaclass.model.live.LiveCourseDescription;

/**
 * <p>
 * 课程简介 服务类
 * </p>
 *
 * @author yagote
 * @since 2023-03-08
 */
public interface LiveCourseDescriptionService extends IService<LiveCourseDescription> {
    //获取直播课程描述信息
    LiveCourseDescription getLiveCourseById(Long id);
}
