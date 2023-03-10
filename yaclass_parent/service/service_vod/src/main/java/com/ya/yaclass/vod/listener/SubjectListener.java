package com.ya.yaclass.vod.listener;

import com.alibaba.excel.context.AnalysisContext;
import com.alibaba.excel.event.AnalysisEventListener;
import com.ya.yaclass.model.vod.Subject;
import com.ya.yaclass.vo.vod.SubjectEeVo;
import com.ya.yaclass.vod.mapper.SubjectMapper;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * @author yagote    create 2023/3/6 12:02
 */
@Component
public class SubjectListener extends AnalysisEventListener<SubjectEeVo> {

    //注入mapper
//    @Autowired
    @Resource
    private SubjectMapper subjectMapper;

    //一行一行，从第二行
    @Override
    public void invoke(SubjectEeVo subjectEeVo, AnalysisContext analysisContext) {
        Subject subject = new Subject();
        //  SubjectEeVo -- Subject
        BeanUtils.copyProperties(subjectEeVo,subject);
        //添加
        subjectMapper.insert(subject);
    }

    @Override
    public void doAfterAllAnalysed(AnalysisContext analysisContext) {

    }
}