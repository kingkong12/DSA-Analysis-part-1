# DSA-Analysis-part-1
Data structure analysis 


In This programming I have implemented the following three sorting algorithms and collectected time performance measurements on them.
1.Mergesort, 
2. Heapsort, 
3. Quicksort.

The running time of each sorting algorithm is measured in two ways:

  a. Counting the number of key comparisons, COMPCOUNT. To obtain this count, it is suggeted that you write a function COMPARE(X,Y), which will perform a comparison between X and Y and increment COMPCOUNT. 
  
  Then, wherever ywe need to perform a key comparison in your algorithms, we simply make a call to this function. 
  b .we Use the actual measured CLOCK tim

1. A small array size, n = 32, to verify correctness
I Ran each algorithm on three sets of data: (1) Sorted; (2) Reversely sorted; and (3) Randomly generated. For simplicity in analyzing i used integers. For each case, made sure the same original data is input to all three algorithms. Printed both the sorted array and measured number of comparisons for each case to show the correctness of my algorithms.

2 Large array sizes to determine time complexity
 n = 210 = 1,024 • n = 215 = 32,768 • n = 220 = 1,048,576


For each value of n, produced an array of n randomly generated elements only once. Again, made sure to provide the same randomly-generated array of data to all three sorting algorithms for better analysis. 
Tabulated the performace results, listing both the number of comparisons and the measured clock times. Used the tabulated number of comparisons to determine the time complexity. For example, does the data for quicksort verify O(n2) or O(nlogn) time, and what is the constant factor? Note that since I used a random sequence to sort, the running times correspond to the average-case time complexities.
