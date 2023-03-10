package com.ya.yaclass.vod.service;


import com.baomidou.mybatisplus.extension.service.IService;
import com.ya.yaclass.model.vod.Video;

/**
 * <p>
 * 课程视频 服务类
 * </p>
 *
 * @author yagote
 * @since 2023-03-06
 */
public interface VideoService extends IService<Video> {
    //根据课程id删除小节
    void removeVideoByCourseId(Long id);

    //删除小节 删除视频
    void removeVideoById(Long id);
}
