package com.ya.yaclass.live.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.ya.yaclass.model.live.LiveCourseGoods;
import com.ya.yaclass.live.mapper.LiveCourseGoodsMapper;
import com.ya.yaclass.live.service.LiveCourseGoodsService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 * 直播课程关联推荐表 服务实现类
 * </p>
 *
 * @author yagote
 * @since 2023-03-08
 */
@Service
public class LiveCourseGoodsServiceImpl extends ServiceImpl<LiveCourseGoodsMapper, LiveCourseGoods> implements LiveCourseGoodsService {

    //查询直播课程商品列表
    @Override
    public List<LiveCourseGoods> getGoodsListCourseId(Long liveCourseId) {
        return baseMapper.selectList(new LambdaQueryWrapper<LiveCourseGoods>()
                .eq(LiveCourseGoods::getLiveCourseId, liveCourseId));
    }
}
