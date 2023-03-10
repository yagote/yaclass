package com.ya.yaclass.vod.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.ya.yaclass.model.vod.Course;
import com.ya.yaclass.vo.vod.CoursePublishVo;
import com.ya.yaclass.vo.vod.CourseVo;

/**
 * <p>
 * 课程 Mapper 接口
 * </p>
 *
 * @author yagote
 * @since 2023-03-06
 */
public interface CourseMapper extends BaseMapper<Course> {

    //根据课程id查询发布课程信息
    CoursePublishVo selectCoursePublishVoById(Long id);

    //根据课程id查询课程详情
    CourseVo selectCourseVoById(Long courseId);
}
