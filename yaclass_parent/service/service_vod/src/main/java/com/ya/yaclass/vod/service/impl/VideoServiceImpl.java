package com.ya.yaclass.vod.service.impl;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.ya.yaclass.model.vod.Video;
import com.ya.yaclass.vod.mapper.VideoMapper;
import com.ya.yaclass.vod.service.VideoService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.util.List;

/**
 * <p>
 * 课程视频 服务实现类
 * </p>
 *
 * @author yagote
 * @since 2023-03-06
 */
@Service
public class VideoServiceImpl extends ServiceImpl<VideoMapper, Video> implements VideoService {

    //根据课程id删除小节
    @Override
    public void removeVideoByCourseId(Long id) {
        QueryWrapper<Video> wrapper = new QueryWrapper<>();
        wrapper.eq("course_id",id);
        baseMapper.delete(wrapper);
    }
    @Override
    public void removeVideoById(Long id) {

    }
}
