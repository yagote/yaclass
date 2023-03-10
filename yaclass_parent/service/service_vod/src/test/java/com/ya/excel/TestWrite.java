package com.ya.excel;

import com.alibaba.excel.EasyExcel;

import java.util.ArrayList;
import java.util.List;

/**
 * @author yagote    create 2023/3/6 12:33
 */
public class TestWrite {
    public static void main(String[] args) {
        //设置文件名称和路径
        String fileName = "D:\\yaclass测试文件.xlsx";
        //调用方法
        EasyExcel.write(fileName,User.class)
                .sheet("写操作")
                .doWrite(data());
        System.out.println("文件创建完成！");
    }

    //循环设置要添加的数据，最终封装到list集合中
    private static List<User> data() {
        List<User> list = new ArrayList<User>();
        for (int i = 0; i < 10; i++) {
            User data = new User();
            data.setId(i);
            data.setName("yaclass"+i);
            list.add(data);
        }
        return list;
    }
}
