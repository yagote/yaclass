package com.ya.yaclass;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 *  题目（与本项目无关）：统计字符串中出现次数最多的字符，不统计标点符号，不区分大小写字母
 * @author yagote    create 2023/3/10 11:01
 */
public class CharacterCounter {
    public static void main(String[] args) {      //多个最大值仅输出其中一个
        Scanner input = new Scanner(System.in);
        System.out.println("请输入字符串：");
        String str = input.next();
        Map<Character, Integer> countMap = new HashMap<>(); // 创建HashMap用于统计字符出现次数
        //HashMap<Character,Integer> countMap = new HashMap<>(); // 创建HashMap用于统计字符出现次数

        // 遍历字符串中的每一个字符,统计每个字符出现的次数
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (Character.isLetterOrDigit(c)) { // 如果字符是字母或数字，统计其出现次数（忽略标点符号）
                c = Character.toLowerCase(c);   // 将字符统一转为小写字母再计数，忽略大小写
                countMap.put(c, countMap.getOrDefault(c, 0) + 1);    // 如果HashMap中已经存在该字符，将其出现次数+1；否则添加新的键值对，值为0+1
            }
        }

        int maxCount = 0;  //初始化为0，说明字符串中没有出现过数字或字母
        char maxChar = '\0';    //初始化为空字符或NULL
        for (Map.Entry<Character, Integer> entry : countMap.entrySet()) {   // 遍历HashMap找到出现次数最多的字符
            char c = entry.getKey();
            int count = entry.getValue();   //获取每个键对应的值,默认值已初始化为0
            if (count >= maxCount) {
                maxCount = count;
                maxChar = c;
            }
        }
        System.out.printf("在字符串\"%s\"中，出现次数最多的字符是'%c',共%d次\n", str, maxChar, maxCount);
    }


//    public static void main(String[] args) {      //输出最大值的全部字符
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("请输入字符串：");
//        String str = scanner.nextLine().toLowerCase();
//        Map<Character, Integer> map = new HashMap<>();
//        int maxCount = 0;
//        for (char c : str.toCharArray()) {
//            if (Character.isLetterOrDigit(c)) {
//                if (map.containsKey(c)) {
//                    map.put(c, map.get(c) + 1);
//                } else {
//                    map.put(c, 1);
//                }
//                maxCount = Math.max(maxCount, map.get(c));
//            }
//        }
//        System.out.print("出现次数最多的字符为：");
//        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
//            if (entry.getValue() == maxCount) {
//                System.out.printf("\"%s\" ",entry.getKey());
//            }
//        }
//        System.out.printf("共%d次",maxCount);
//    }
}

