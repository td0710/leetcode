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
        int r = arr.size() - 1;
        while(l <= r) {
            int mid = l+(r - l + 1) / 2;
            if(arr.get(mid) < num) l = mid + 1; 
            else r = mid-1; 
        }
        return l; 
    }
}