def swap(xp, yp):
    temp = xp
    xp=yp
    yp=temp
def bubbleSort(arr, n):
    i = None
    j = None
    for i in range (n-1):
        for j in range (n-i-1):
            if (arr[j]>arr[j+1]):
                swap(arr[j],arr[j+1])
def printArray(arr, size):
    i = None
    for i in range (size):
        print(a)
def main():
    arr = [64,34,25,12,22,11,90]
    bubbleSort(arr,n)
    printArray(arr,n)
    return 0
