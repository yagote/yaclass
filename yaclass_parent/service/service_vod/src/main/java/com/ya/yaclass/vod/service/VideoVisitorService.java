package com.ya.yaclass.vod.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.ya.yaclass.model.vod.VideoVisitor;

import java.util.Map;

/**
 * <p>
 * 视频来访者记录表 服务类
 * </p>
 *
 * @author yagote
 * @since 2023-03-06
 */
public interface VideoVisitorService extends IService<VideoVisitor> {

    //课程统计的接口
    Map<String, Object> findCount(Long courseId, String startDate, String endDate);
}
