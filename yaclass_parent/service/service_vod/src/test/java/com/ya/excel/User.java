package com.ya.excel;

import com.alibaba.excel.annotation.ExcelProperty;
import lombok.Data;

/**
 * @author yagote    create 2023/3/6 12:32
 */
@Data
public class User {

    @ExcelProperty(value = "用户编号",index = 0)    //Excel中的列名，第1列
    private int id;

    @ExcelProperty(value = "用户名称",index = 1)    //Excel中的列名，第2列
    private String name;
}
