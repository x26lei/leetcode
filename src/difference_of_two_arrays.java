import java.util.*;
class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        HashSet<Integer> hashNums1 = new HashSet<Integer>();
        for (int num:nums1){
            hashNums1.add(num);
        }
        HashSet<Integer> hashNums2 = new HashSet<Integer>();
        for (int num:nums2){
            hashNums2.add(num);
        }
        List<Integer> res1 = new ArrayList<Integer>();
        List<Integer> res2 = new ArrayList<Integer>();
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        for (Integer i:hashNums1){
            if (!hashNums2.contains(i)){
                res1.add(i);
            }
        }
        for (Integer i:hashNums2){
            if (!hashNums1.contains(i)){
                res2.add(i);
            }
        }
        res.add(res1);
        res.add(res2);
        return res;
    }
}