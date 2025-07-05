class Solution {
    public int findLucky(int[] arr) {
        Map<Integer,Integer> map = new HashMap<>() ; 

        Arrays.stream(arr)
                .forEach(x -> map.put(x, map.getOrDefault(x, 0) + 1));

         return map.entrySet().stream()
                .filter(entry -> entry.getKey().equals(entry.getValue()))
                .map(Map.Entry::getKey)
                .max(Integer::compareTo)
                .orElse(-1);
    }
}