package com.ya.yaclass.live.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.ya.yaclass.model.live.LiveCourseAccount;

/**
 * <p>
 * 直播课程账号表（受保护信息） 服务类
 * </p>
 *
 * @author yagote
 * @since 2023-03-08
 */
public interface LiveCourseAccountService extends IService<LiveCourseAccount> {
    //获取直播账号信息
    LiveCourseAccount getLiveCourseAccountCourseId(Long id);
}
