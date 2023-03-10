package com.ya.yaclass.order.service;

import java.util.Map;

/**
 * @author yagote    create 2023/3/8 17:30
 */
public interface WXPayService {
    //微信支付
    Map<String, Object> createJsapi(String orderNo);

    //根据订单号调用微信接口查询支付状态
    Map<String, String> queryPayStatus(String orderNo);
}