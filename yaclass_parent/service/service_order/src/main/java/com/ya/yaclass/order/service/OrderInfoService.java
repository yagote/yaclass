package com.ya.yaclass.order.service;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.ya.yaclass.model.order.OrderInfo;
import com.ya.yaclass.vo.order.OrderFormVo;
import com.ya.yaclass.vo.order.OrderInfoQueryVo;
import com.ya.yaclass.vo.order.OrderInfoVo;

import java.util.Map;

/**
 * <p>
 * 订单表 订单表 服务类
 * </p>
 *
 * @author yagote
 * @since 2023-03-07
 */
public interface OrderInfoService extends IService<OrderInfo> {

    //订单列表
    Map<String, Object> selectOrderInfoPage(Page<OrderInfo> pageParam, OrderInfoQueryVo orderInfoQueryVo);

    //生成订单方法
    Long submitOrder(OrderFormVo orderFormVo);

    //订单id获取订单信息
    OrderInfoVo getOrderInfoById(Long id);

    //更新订单状态 ：已经支付
    void updateOrderStatus(String out_trade_no);
}
