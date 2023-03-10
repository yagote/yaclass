package com.ya.yaclass.vod.controller;


import com.ya.yaclass.model.vod.Chapter;
import com.ya.yaclass.result.Result;
import com.ya.yaclass.vo.vod.ChapterVo;
import com.ya.yaclass.vod.service.ChapterService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * <p>
 * 课程 前端控制器
 * </p>
 *
 * @author yagote
 * @since 2023-03-06
 */
@RestController
@RequestMapping(value="/admin/vod/chapter")
//@CrossOrigin  //配置了微服务的网关了，service_gateway，用网关来处理跨域问题，不用这个注解了
public class ChapterController {

    @Autowired
    private ChapterService chapterService;

    //1 大纲列表（章节和小节列表）
    @ApiOperation("大纲列表")
    @GetMapping("getNestedTreeList/{courseId}")
    public Result getTreeList(@PathVariable Long courseId) {
        List<ChapterVo> list = chapterService.getTreeList(courseId);
        return Result.ok(list);
    }

    //2 添加章节
    @PostMapping("save")
    public Result save(@RequestBody Chapter chapter) {
        chapterService.save(chapter);
        return Result.ok(null);
    }

    //3 修改-根据id查询
    @GetMapping("get/{id}")
    public Result get(@PathVariable Long id) {
        Chapter chapter = chapterService.getById(id);
        return Result.ok(chapter);
    }

    //4 修改-最终实现
    @PostMapping("update")
    public Result update(@RequestBody Chapter chapter) {
        chapterService.updateById(chapter);
        return Result.ok(null);
    }

    //5 删除章节
    @DeleteMapping("remove/{id}")
    public Result remove(@PathVariable Long id) {
        chapterService.removeById(id);
        return Result.ok(null);
    }
}

