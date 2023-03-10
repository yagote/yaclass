package com.ya.yaclass;

import java.util.Scanner;

/**
 * 题目（与本项目无关）：将文本转为SQL的插入语句
 * @author yagote    create 2023/3/10 13:48
 */
public class TextToSqlInsert {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("请输入要转换的文本：");
//        String inputText = scanner.nextLine();
//
//        // 将输入的文本进行处理，处理成SQL中VALUES后面的数据格式，例如：(1, 'hello'), (2, 'world')
//        String[] inputData = inputText.split(",");
//        StringBuilder sb = new StringBuilder();
//        sb.append("(");
//        for (int i = 0; i < inputData.length; i++) {
//            sb.append("'" + inputData[i].trim() + "'");
//            if (i != inputData.length - 1) {
//                sb.append(",");
//            }
//        }
//        sb.append(")");
//
//        // 构造SQL语句
//        String tableName = "mytable";
//        String sql = "INSERT INTO " + tableName + " VALUES " + sb.toString() + ";";
//
//        System.out.println("转换后的SQL语句为：");
//        System.out.println(sql);
//    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入要转换的文本：");
        String inputText = scanner.nextLine();

        // 将输入的文本按分号分隔成多个语句，存在数组中
        String[] inputStatements = inputText.split(";");
        StringBuilder sb = new StringBuilder();

        // 对于每个语句，将其处理成SQL中VALUES后面的数据格式
        for (int i = 0; i < inputStatements.length; i++) {
            if (!inputStatements[i].isEmpty()) {
                String[] inputData = inputStatements[i].split(",");
                StringBuilder values = new StringBuilder("(");
                for (int j = 0; j < inputData.length; j++) {
                    values.append("'" + inputData[j].trim() + "'");     //将 inputData 数组中第 j 个元素的前后空格删除
                    if (j != inputData.length - 1) {    //在最后一个值的后面就不加逗号了
                        values.append(",");
                    }
                }
                values.append(")");
                // 构造SQL语句
                String tableName = "mytable";
                String sql = "INSERT INTO " + tableName + " VALUES " + values.toString() + ";";
                sb.append(sql + "\n"); // 添加到StringBuilder中
            }
        }

        System.out.println("转换后的SQL语句为：");
        System.out.println(sb.toString()); // 输出所有的SQL语句
    }
}
