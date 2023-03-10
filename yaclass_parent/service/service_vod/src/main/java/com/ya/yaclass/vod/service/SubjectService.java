package com.ya.yaclass.vod.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.ya.yaclass.model.vod.Subject;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletResponse;
import java.util.List;

/**
 * 课程科目 服务类
 * @author yagote    create 2023/3/6 11:33
 */
public interface SubjectService extends IService<Subject> {
    //课程分类列表
    //懒加载，每次查询一层数据
    List<Subject> selectSubjectList(Long id);

    //课程分类导出
    void exportData(HttpServletResponse response);

    //课程分类导入
    void importData(MultipartFile file);
}
