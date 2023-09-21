class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer, Integer> frequencyHash = new HashMap<>();
        for (int num: arr){
            frequencyHash.put(num, frequencyHash.getOrDefault(num, 0)+1);
        }
        HashSet<Integer> occuHash = new HashSet<Integer>();
        for (int num:frequencyHash.keySet()){
            int value = frequencyHash.get(num);
            if (occuHash.contains(value)){
                return false;
            }
            if (!occuHash.contains(value)){
                occuHash.add(value);
            }
        }
        return true;
    }
}