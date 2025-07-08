class Solution {
    public List<Integer> countSmaller(int[] nums) {
        List<Integer> li = new ArrayList<>() ;
        List<Integer> sort = new ArrayList<>() ;

        for(int i = nums.length-1;i>=0;i--) {
            int ind = insert(sort,nums[i]);
            li.add(ind);
            sort.add(ind,nums[i]) ; 
        }

        Collections.reverse(li) ; 
        return li;
    }

    private int insert(List<Integer> arr, int num) {
        int l = 0; 
        int r = arr.size();
        while(l < r) {
            int mid = (r + l) / 2;
            if(arr.get(mid) >= num) r = mid ; 
            else l = mid + 1; 
        }
        return l; 
    }
}