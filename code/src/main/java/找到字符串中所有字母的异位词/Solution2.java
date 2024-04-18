package 找到字符串中所有字母的异位词;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * ClassName: Solution2
 * Package: 找到字符串中所有字母的异位词
 * Description:滑动窗口
 *
 * @Author KHR
 * @Create 2024/4/16 21:35
 * @Version 1.0
 */
public class Solution2 {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> res=new ArrayList<Integer>();
        if(s.length()<p.length())
            return res;
        int[] pz=new int[26];
        int[] sz=new int[26];


        char[] pchars = p.toCharArray();
        for(char c:pchars){
            pz[c-'a']++;
        }
        for(int i=0;i<p.length();i++){
            sz[s.charAt(i)-'a']++;
        }
        if(Arrays.equals(sz,pz))
            res.add(0);
        int left=1;

        while(left+p.length()<=s.length()){
//            int[] sz = Arrays.copyOf(pz, pz.length);
            sz[s.charAt(left-1)-'a']--;
            sz[s.charAt(left+p.length()-1)-'a']++;
            if(Arrays.equals(sz,pz))
                res.add(left++) ;
            else
                left++;

        }





        return res;
    }
    @Test
    public void test() {
        String s = "aaaaaaaaaa";
        String p = "aaaaaaaaaaaaa";
        System.out.println(findAnagrams(s, p));

    }
}
