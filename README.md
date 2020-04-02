# Find-Three-Largest-Numbers
  - write an function that take an input array which is random order, and give output as  sorted three largest integer array
  - if there are duplicate integer that also in the most 3 largest, we should return largest as dublicate
  - ex: input {1, 2, 3 , 1, 9, 0, 22, 99, 50 , 99, 49}
  - output is {50 , 99, 99}
# Solution1
  - sorted array on descender order.
  - return the= first three items of array.
# Solution2
  - traverse the array and add in element that compare with the exist 3 maximum
  - keep only the top 3 largest
  - compare the new large with existing three,
  - delete the smallest and shift all element to the left 
