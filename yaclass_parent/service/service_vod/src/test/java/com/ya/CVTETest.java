package com.ya;

/**
 * CVTE笔试题：如何从一个包含0和1的数组中将所有的0移动1的左边，求最少的移动步数。相同的0或1是不同的，也可以移动。
 * @author yagote    create 2023/3/6 20:16
 */
public class CVTETest {
    public static void main(String[] args) {
        int[] prods = {1,1,1,1,0,0,0,0,1,0};
        System.out.println(LeastCount(prods));
    }
    public static int LeastCount(int[] prods){
        int count1 = 0,count2 = 0,count3 = 0;
        for(int i = 0;i<prods.length;i++){  //统计数组中0和1的个数
            if(prods[i]==0) count1++;
            else count2++;
        }
        for(int i = 0;i<prods.length;i++){  //判断数组第一个值为1的元素位置
            if(prods[i]==0) count3++;
            else break;
        }
        return (count1-count3)<(count2-count3)?(count1-count3):(count2-count3);
    }
}
