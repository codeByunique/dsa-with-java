// Problem: Find Lucky
// Author: Faizan (faizansaifigns)

import java.util.HashMap;

class Solution {
    public int findLucky(int[] arr) {
        int n=arr.length;
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int nums:arr){
            map.put(nums,map.getOrDefault(nums,0)+1);
        }
        int result=-1;
        for (HashMap.Entry<Integer, Integer> entry : map.entrySet()){
            if(entry.getKey().equals(entry.getValue())){
            result=Math.max(result,entry.getKey());
        }
        }
        return result;
        
    }
}
