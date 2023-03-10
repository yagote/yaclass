package com.ya.yaclass.live.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.ya.yaclass.model.live.LiveCourseGoods;

import java.util.List;

/**
 * <p>
 * 直播课程关联推荐表 服务类
 * </p>
 *
 * @author yagote
 * @since 2023-03-08
 */
public interface LiveCourseGoodsService extends IService<LiveCourseGoods> {
    //查询直播课程商品列表
    List<LiveCourseGoods> getGoodsListCourseId(Long id);
}
