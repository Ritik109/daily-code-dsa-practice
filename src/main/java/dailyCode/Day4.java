package dailyCode;

import java.util.HashMap;
import java.util.Map;

public class Day4 {
    public static void main(String[] args) {
        System.out.println(isAnagram("map","amp"));
    }
    public static boolean isAnagram(String s, String t) {

        Map<Character, Integer> map = new HashMap<>();
        if(s.length()!=t.length()) return false;

        for(int i=0; i<s.length();i++){
            char ch = s.charAt(i);
            if(!map.containsKey(ch)){
                map.put(ch,1);
            }else{
                map.put(ch,map.get(ch)+1);
            }
        }

        for(int i=0; i<t.length();i++){
            char ch = t.charAt(i);
            if(!map.containsKey(ch)) return false;
            else{
                if(map.get(ch)==1) map.remove(ch);
                else{
                    map.put(ch,map.get(ch)-1);
                }
            }
        }
        return map.isEmpty() ;

    }
}

