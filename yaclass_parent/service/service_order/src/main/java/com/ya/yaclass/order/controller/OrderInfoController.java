package com.ya.yaclass.order.controller;


import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.ya.yaclass.model.order.OrderInfo;
import com.ya.yaclass.order.service.OrderInfoService;
import com.ya.yaclass.result.Result;
import com.ya.yaclass.vo.order.OrderInfoQueryVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

/**
 * <p>
 * 订单表 订单表 前端控制器
 * </p>
 *
 * @author yagote
 * @since 2023-03-07
 */
@RestController
@RequestMapping(value="/admin/order/orderInfo")
public class OrderInfoController {

    @Autowired
    private OrderInfoService orderInfoService;

    //订单列表
    @GetMapping("{page}/{limit}")
    public Result listOrder(@PathVariable Long page,
                            @PathVariable Long limit,
                            OrderInfoQueryVo orderInfoQueryVo) {
        //创建page对象
        Page<OrderInfo> pageParam = new Page<>(page,limit);
        Map<String,Object> map =
                orderInfoService.selectOrderInfoPage(pageParam,orderInfoQueryVo);
        return Result.ok(map);
    }
}

