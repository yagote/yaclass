package com.ya.yaclass.vod.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.ya.yaclass.model.vod.Chapter;
import com.ya.yaclass.vo.vod.ChapterVo;

import java.util.List;

/**
 * <p>
 * 课程 服务类
 * </p>
 *
 * @author yagote
 * @since 2023-03-06
 */
public interface ChapterService extends IService<Chapter> {
    //1 大纲列表（章节和小节列表）
    List<ChapterVo> getTreeList(Long courseId);

    //根据课程id删除章节
    void removeChapterByCourseId(Long id);
}
