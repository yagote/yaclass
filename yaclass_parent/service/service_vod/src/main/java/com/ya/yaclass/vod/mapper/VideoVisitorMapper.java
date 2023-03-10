package com.ya.yaclass.vod.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.ya.yaclass.model.vod.VideoVisitor;
import com.ya.yaclass.vo.vod.VideoVisitorCountVo;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * <p>
 * 视频来访者记录表 Mapper 接口
 * </p>
 *
 * @author yagote
 * @since 2023-03-06
 */
public interface VideoVisitorMapper extends BaseMapper<VideoVisitor> {

    //课程统计的接口
    List<VideoVisitorCountVo> findCount(@Param("courseId") Long courseId,
                                        @Param("startDate")String startDate,
                                        @Param("endDate")String endDate);
}