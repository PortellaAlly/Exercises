def lowestSearch(arr):
    lowest = arr[0]
    lowest_index = 0
    for i in range(1, len(arr)):
        if arr[i] < lowest:
            lowest = arr[i]
            lowest_index = i
    return lowest_index

def selectionSort(arr):
    newArr = []
    for i in range(len(arr)):
        lowest = lowestSearch(arr)
        newArr.append(arr.pop(lowest))
    return newArr