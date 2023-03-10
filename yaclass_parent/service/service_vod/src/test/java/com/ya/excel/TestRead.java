package com.ya.excel;

import com.alibaba.excel.EasyExcel;

/**
 * @author yagote    create 2023/3/6 12:41
 */
public class TestRead {

    public static void main(String[] args) {
        //设置文件名称和路径
        String fileName = "D:\\atguigu.xlsx";
        //调用方法进行读操作
        EasyExcel.read(fileName,User.class,new ExcelListener()).sheet().doRead();
    }
}
