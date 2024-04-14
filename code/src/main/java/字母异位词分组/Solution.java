package 字母异位词分组;

import org.junit.Test;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapters;
import java.util.*;
import java.util.stream.Collectors;

/**
 * ClassName: Solution
 * Package: 字母异位词分组
 * Description:
 *
 * @Author KHR
 * @Create 2024/4/14 13:31
 * @Version 1.0
 */
public class Solution {
        public List<List<String>> groupAnagrams(String[] strs) {
            Map<String,List<String>> map=new HashMap<String,List<String>>();
            for(String str:strs)
            {
                char[] arr=str.toCharArray();
                Arrays.sort(arr);
                List<String> list = map.getOrDefault(String.valueOf(arr), new ArrayList<String>());
                list.add(str);
                map.put(String.valueOf(arr),list);
            }
            return new ArrayList<List<String>>(map.values());
        }


        @Test
        public void test(){
            String[] str=new String[]{"eat","tea","tan","ate","nat","bat"};
            System.out.println(groupAnagrams(str));
        }

}


