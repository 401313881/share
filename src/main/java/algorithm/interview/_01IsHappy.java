package algorithm.interview;

import java.util.ArrayList;
import java.util.List;

/**
 * @author LRK
 * @date 2019/4/5 13:10
 * project_name LeetCode
 * package_name algorithm.interview
 * description:
 * God Bless, No Bug!
 *
 *  快乐数
 * 编写一个算法来判断一个数是不是“快乐数”。
 *
 * 一个“快乐数”定义为：对于一个正整数，每一次将该数替换为它每个位置上的数字的平方和，
 * 然后重复这个过程直到这个数变为 1，也可能是无限循环但始终变不到 1。如果可以变为 1，那么这个数就是快乐数。
 *
 * 示例:
 *
 * 输入: 19
 * 输出: true
 * 解释:
 * 12 + 92 = 82
 * 82 + 22 = 68
 * 62 + 82 = 100
 * 12 + 02 + 02 = 1
 */
public class _01IsHappy {

    public boolean isHappy(int n) {
        List<Integer> list = new ArrayList<>();
        while (true){

            int sum = getSum(n);
            if (sum==1) {
                return true;
            }
            if (list.contains(sum)) {
                return false;
            }
            list.add(sum);
            n = getSum(sum);
        }
    }
    private int getSum(int n) {

        int sum = 0;
        while (n!=0){
            int num = n%10;
            sum += num*num;
            n = n/10;
        }
        return sum;
    }
}
