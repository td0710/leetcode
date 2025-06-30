function maximumDifference(nums: number[]): number {
    const set = new Set<number>() ; 

    let res = - Infinity ; 

    set.add(nums[0]) ; 

    for (let i = 1; i<nums.length; i++) {
        const tmp =  Math.min(...set)
        if(nums[i] > tmp) res = Math.max(res,nums[i] - tmp) ; 
        set.add(nums[i])
    }

    return res === -Infinity ? -1 : res ; 
};