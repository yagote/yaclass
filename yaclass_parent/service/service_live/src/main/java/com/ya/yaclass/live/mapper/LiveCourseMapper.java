package com.ya.yaclass.live.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.ya.yaclass.model.live.LiveCourse;
import com.ya.yaclass.vo.live.LiveCourseVo;

import java.util.List;

/**
 * <p>
 * 直播课程表 Mapper 接口
 * </p>
 *
 * @author yagote
 * @since 2023-03-08
 */
public interface LiveCourseMapper extends BaseMapper<LiveCourse> {

    //获取最近的直播
    List<LiveCourseVo> getLatelyList();
}
