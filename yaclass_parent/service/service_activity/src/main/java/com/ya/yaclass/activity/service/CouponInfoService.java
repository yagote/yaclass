package com.ya.yaclass.activity.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.ya.yaclass.model.activity.CouponInfo;
import com.ya.yaclass.model.activity.CouponUse;
import com.ya.yaclass.vo.activity.CouponUseQueryVo;

/**
 * <p>
 * 优惠券信息 服务类
 * </p>
 *
 * @author yagote
 * @since 2023-03-07
 */
public interface CouponInfoService extends IService<CouponInfo> {

    //获取已经使用优惠券列表（条件查询分页）
    IPage<CouponUse> selectCouponUsePage(Page<CouponUse> pageParam, CouponUseQueryVo couponUseQueryVo);

    //更新优惠券
    void updateCouponInfoUseStatus(Long couponUseId, Long orderId);
}
