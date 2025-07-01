function compareVersion(version1: string, version2: string): number {
    const arr1 = version1.split(".") ; 
    const arr2 = version2.split(".") ; 

    let i = 0, j = 0;

    while (i < arr1.length && j < arr2.length) {
        if (parseInt(arr1[i]) < parseInt(arr2[j])) return -1; 
        else if (parseInt(arr1[i]) > parseInt(arr2[j])) return 1; 

        i++;
        j++;
    }

    while (i < arr1.length) {
        if(parseInt(arr1[i]) != 0) return 1 ;
        i++ ;
    }
    while (j < arr2.length) {
        if(parseInt(arr2[j]) != 0) return -1 ;
        j++
    }

    return 0 ;
};