function findDuplicates(nums: number[]): number[] {
    const arr = [] ; 

    nums.sort((a,b) => a-b) ; 

    for(let i = 0; i<nums.length-1 ;i++) {
        let val = nums[i] ^ nums[i+1] ; 

        if(val == 0) {
            arr.push(nums[i]) ; 
            i++ ; 
        }
    }
    return arr ; 
};