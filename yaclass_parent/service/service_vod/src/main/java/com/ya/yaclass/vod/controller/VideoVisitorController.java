package com.ya.yaclass.vod.controller;


import com.ya.yaclass.result.Result;
import com.ya.yaclass.vod.service.VideoVisitorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

/**
 * <p>
 * 视频来访者记录表 前端控制器
 * </p>
 *
 * @author yagote
 * @since 2023-03-06
 */
@RestController
@RequestMapping(value="/admin/vod/videoVisitor")
//@CrossOrigin
public class VideoVisitorController {

    @Autowired
    private VideoVisitorService videoVisitorService;

    //课程统计的接口
    @GetMapping("findCount/{courseId}/{startDate}/{endDate}")
    public Result findCount(@PathVariable Long courseId,
                            @PathVariable String startDate,
                            @PathVariable String endDate) {
        Map<String,Object> map =
                videoVisitorService.findCount(courseId,startDate,endDate);
        return Result.ok(map);
    }
}

