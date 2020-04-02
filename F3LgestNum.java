class F3LgestNum{
  public static int[] findThreeLargestNumbers(int[] array) {
   // Write your code here.
   int [] threeLargest = {Integer.MIN_VALUE,Integer.MIN_VALUE, Integer.MIN_VALUE};
   for (int num : array){
      updateLargestArray(threeLargest, num);
   }

   return threeLargest;
 }
 public static void updateLargestArray(int [] threeLargest, int num){
   if (num > threeLargest[2]){
     shiftThisNum(threeLargest, num, 2);
   }else if (num > threeLargest[1]){
     shiftThisNum(threeLargest, num, 1);
   }else if (num > threeLargest[0]){
     shiftThisNum(threeLargest, num , 0);
   }
 }
 public static void shiftThisNum(int [] threeLargest, int num, int index){
   for (int i = 0 ; i <= index; i ++){
     if (i == index){
       threeLargest[i]= num;
     }else{
       threeLargest[i] = threeLargest[i+1];
     }
   }
 }
}
