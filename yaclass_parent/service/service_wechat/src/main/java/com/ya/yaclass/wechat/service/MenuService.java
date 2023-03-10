package com.ya.yaclass.wechat.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.ya.yaclass.model.wechat.Menu;
import com.ya.yaclass.vo.wechat.MenuVo;

import java.util.List;

/**
 * <p>
 * 订单明细 订单明细 服务类
 * </p>
 *
 * @author yagote
 * @since 2023-03-07
 */
public interface MenuService extends IService<Menu> {

    //获取所有菜单，按照一级和二级菜单封装
    List<MenuVo> findMenuInfo();

    //获取所有一级菜单
    List<Menu> findMenuOneInfo();

    //同步菜单方法
    void syncMenu();

    //公众号菜单删除
    void removeMenu();
}
