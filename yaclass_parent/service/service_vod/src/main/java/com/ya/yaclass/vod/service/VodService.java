package com.ya.yaclass.vod.service;

import java.util.Map;

/**
 * @author yagote    create 2023/3/7 11:50
 */
public interface VodService {
    //上传视频
    String updateVideo();

    //删除腾讯云视频
    void removeVideo(String fileId);

    //点播视频播放接口
    Map<String, Object> getPlayAuth(Long courseId, Long videoId);
}