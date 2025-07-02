/**
 * // This is the MountainArray's API interface.
 * // You should not implement it, or speculate about its implementation
 * class MountainArray {
 *      get(index: number): number {}
 *
 *      length(): number {}
 * }
 */

function findInMountainArray(target: number, mountainArr: MountainArray) {
	let end = mountainArr.length() - 1; 
    let start = 0;

    while(start < end) {
        let mid = start + Math.floor((end-start) /2);
        let num = mountainArr.get(mid);
        let num1 = mountainArr.get(mid+1);

        if(num>num1) end = mid ; 
        else start = mid + 1; 
    }

    start = 0 ;
    let peak = end;

    while(start <= end) {
        let mid = start + Math.floor((end-start) /2);
        let num = mountainArr.get(mid);

        if(num < target) start = mid + 1 ; 
        else if(num > target) end = mid-1;
        else return mid ;
    }

    start = peak+1; 
    end = mountainArr.length()-1;

    while(start <= end){
        let mid = start + Math.floor((end-start) /2);
        let num = mountainArr.get(mid);
        if(num < target) end = mid - 1;
        else if(num > target) start = mid + 1;

        else return mid; 
    }
    return -1;
};