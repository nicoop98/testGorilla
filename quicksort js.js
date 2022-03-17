const list = [3, 0, 2, 5, -1, 4, 1, 10, 23, 15, 20, 12];

const sorted = [-1, 0, 1, 2, 3, 4, 5, 10, 12, 15, 20, 23];

function QuickSort(unsortedArray){
    if(unsortedArray.length <= 1){
        return unsortedArray;
    }

    const pivot = unsortedArray[unsortedArray.length - 1];
    const lowerValues = [];
    const higherValues = [];

    for(let i=0; i < unsortedArray.length-1;i++){
        if(unsortedArray[i] < pivot){
            lowerValues.push(unsortedArray[i]);
        }
        else{
            higherValues.push(unsortedArray[i])
        }
    }

    return [...QuickSort(lowerValues),pivot,...QuickSort(higherValues)];

}

console.log(QuickSort(list));