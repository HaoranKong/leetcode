package 找到字符串中所有字母的异位词;

import org.junit.Test;

import java.util.*;

/**
 * ClassName: Solution
 * Package: 找到字符串中所有字母的异位词
 * Description:
 *
 * @Author KHR
 * @Create 2024/4/16 20:53
 * @Version 1.0
 */
public class Solution {
    public List<Integer> findAnagrams(String s, String p) {
//        char[] chars = p.toCharArray();
//        Arrays.sort(chars);
//        String s1 = new String(chars);
//        int left = 0;
//        while (left + p.length() < s.length()) {
//            String substring = s.substring(left, left + p.length());
//
//        }
        List<Integer> list = new ArrayList<Integer>();
        int left = 0;
        int length = p.length();
        char[] charArray = p.toCharArray();
        Arrays.sort(charArray);
        String s1 =String.valueOf(charArray);
        Set<String> set = new HashSet<String>();
        set.add(s1);
        while (left + length <= s.length()) {
            char[] chars = s.substring(left, left+length).toCharArray();
            Arrays.sort(chars);
            String s2 = String.valueOf(chars);
            if (set.contains(s2))
                list.add(left);
            left++;

        }


        return list;

    }

    /**
     * @author khr
     * @date 2024-04-16
     */
    @Test
    public void test() {
        String s = "abab";
        String p = "ab";
        System.out.println(findAnagrams(s, p));

    }
}
