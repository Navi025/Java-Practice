/* 
    1. Trapped Water
    2. Buy and sell stocks
    3. Array's Assignment(5 Ques)
*/ 
//          TRAPPED WATER

public class arrayQue{
    public static void trappedWater( int height[] ){
        //left max boundary
        int leftMax[] = new int[height.length];
        leftMax[0]=height[0];
        for (int i = 1; i < height.length; i++){
            leftMax[i] = Math.max(height[i],leftMax[i-1]);
            
        }

        //right max boundary
        int rightMax[] = new int[height.length];
        rightMax[height.length - 1] = height[height.length - 1];
        for (int i = height.length - 2; i>=0; i--) {
            rightMax[i] = Math.max(height[i], rightMax[i+1]);
            
        }
        int trappedWater = 0;
        //loop
        for (int i = 0; i < height.length; i++) {
        //water level = min(lm,rm)
            int waterLevel = Math.min(rightMax[i], leftMax[i]);
        // trapped water = water level - height
            trappedWater += waterLevel - height[i];  
            
        }
        System.out.println("Trapped water : "  + trappedWater);
    }

    public static void main(String args []){
        int height[] = {4,2,0,6,3,2,5};
        trappedWater(height);
    }
}
 

//          TRAPPED WATER Practice
public class arrayQue {

    public static void trappedWater(int height[]) {
        //max left boundary
        int leftMax[] = new int[height.length];
        leftMax[0] = height[0];
        for (int i = 1; i < height.length; i++) {
            leftMax[i] = Math.max(leftMax[i - 1], height[i]);
        }

        //max right boundary
        int rightMax[] = new int[height.length];
        rightMax[height.length - 1] = height[height.length - 1];
        for (int i = height.length - 2; i >= 0; i--) {
            rightMax[i] = Math.max(rightMax[i + 1], height[i]);
        }

        int trappedWater = 0;
        //loop
        for (int i = 0; i < height.length; i++) {
            //water level = min(rightMax, leftMax)
            int waterLevel = Math.min(rightMax[i], leftMax[i]);

            //trappedWater = waterlevel - height[i]            
            trappedWater = trappedWater + (waterLevel - height[i]);

        }
        System.out.println("Trapped Water: " + trappedWater);
    }

    public static void main(String args[]) {
        int height[] = {4, 2, 0, 6, 3, 2, 5};
        trappedWater(height);
    }
}


//              2. Buy and sell stocks

public class arrayQue{
    public static void buyAndSellStock(int prices[]){
        //initialise buying price
        int buyingPrice = Integer.MAX_VALUE;

        //initialise max profit price
        int maxProfit = 0;

        //loop
        for(int i = 0; i<prices.length; i++){
            //condition 1:bp<sp
            if(buyingPrice < prices[i]){
                //calculate toadys profit
                int profit =  prices[i] - buyingPrice;

                //calculate max profit  
                maxProfit = Math.max(maxProfit , profit);

            }
            //condition 2: bp>sp
            else{
                //update buying price
                buyingPrice = prices[i];

            }
            
                
        }
        System.out.println("Maximum Profit : " + maxProfit);
    }

    public static void main(String args[]){
        int prices[] = {7, 6, 5, 4, 3};
        buyAndSellStock(prices);
    }
}


 //               ARRAYS ASSIGNMENT
 //                   QUESTION 1


public class arrayQue{
    public static boolean  duplicate(int array[]){
        for (int i = 0; i < array.length; i++) {
            for (int j = i+1; j < array.length; j++) {
                if(array[i] == array[j]){
                    return true;
                }
            }
            
        }
        return false;
    }

    public static void main(String args[]){
        int array[] = {1,2,3,1};
        int array2[] = {1,2,3,4};
        int array3[] = {1,1,1,2,2,4,3,2,4,2};
        System.out.println(duplicate(array));
        // duplicate(array1);
        // duplicate(array2);
    }
}

//                Question 2
/*
There is an integer array nums sorted in ascending order (with distinct values).
Prior to being passed to your function, nums is possibly rotated at an unknown pivot  
index k (1  <=  k  <  nums.length)  such  that  the  resulting  array  is [nums[k], 
nums[k+1],   ...,   nums[n-1], nums[0],   nums[1],   ...,   nums[k-1]] (0-indexed).  
 For   example, [0,1,2,4,5,6,7] might        be        rotated        at        pivot       
index 3   and become [4,5,6,7,0,1,2].Given the array nums after the possible rotation 
and an integer target, returnthe index oftarget if it is in nums, or -1   if it is not 
in nums.You must write an algorithm with O(log n) runtime complexity.

 */

public class arrayQue {

    public int search(int[] nums, int target) {
        //min will have index of minimum element of nums 
        int min = minSearch(nums);
//find in sorted left 
        if (nums[min] <= target && target <= nums[nums.length - 1]) {
            return search(nums, min, nums.length - 1, target);
        } //find in sorted right 
        else {
            return search(nums, 0, min, target);
        }

    }
//binary search to find target in left to right boundary 

    public int search(int[] nums, int left, int right, int target) {
        int l = left;
        int r = right;
        // System.out.println(left+" "+right); 
        while (l <= r) {
            int mid = l + (r - l) / 2;
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] > target) {
                r = mid - 1;
            } else {
                l = mid + 1;
            }
        }
        return -1;
    }
    //smallest element index

    public int minSearch(int[] nums) {
        int left = 0;
        int right = nums.length - 1;
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (mid > 0 && nums[mid - 1] > nums[mid]) {
                return mid;
            } else if (nums[left] <= nums[mid] && nums[mid] > nums[right]) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return left;
    }
}


// public class arrayQue{
    //find index minimum value   
    public static int minSearch(int nums[]){
        int left = 0;
        int right = nums.length - 1;
        
        while(left<right){
            int mid = left +(right-left)/2;
            if(nums[mid] > nums[right]){
                left = mid + 1;
            }
            else{
                right = mid ;
            }
        }
        return left;
    }
 
    public static int binarySearch(int nums[], int left, int right, int target){
        int l = left;
        int r = right;
        while(l<=r){
            int mid = l+(r-l)/2;
            if(nums[mid] == target){
                return mid; 
            }
            else if(nums[mid] > target){
                r = mid - 1;
            }
            else if (nums[mid] < target){
                l = mid + 1;
            }
        }
        return -1;
    }
 //two shorted array, min - nums.length-1 & pivot - nums[min - 1]
 //binary search in both arrya will give target
    public static int search(int nums[], int target){
        int min = minSearch(nums);
        if(target>= nums[min] && target <= nums[nums.length-1]){
            return binarySearch(nums, min, nums.length-1, target);
        }
        else{
            return binarySearch(nums, 0, min-1, target);
        }
    }

    public static void main(String args[]){
        int nums[] = {4,5,6,7,1,2,3};
        int target = 6;
        
        int result = search(nums, target);

        if(result != -1){
            System.out.println("The target is at index: " + result);
        }
        else{
            System.out.println("Thee target is not in the array.");
        }
    }

}
            QUESTION 3
You  are  given  an  array prices where prices[i] is  the  price  of  a  
given  stock  on  the ith day.Return the maximum profit you can achieve 
from this transaction. If you cannot achieve any profit, return 0.
*

public class arrayQue{
    public static int maxProfit(int prices[]){
        //initialise buying price
        int buyingPrice = Integer.MAX_VALUE;
        //initiaise max profit
        int maxProfit = 0;
        //loop
        for (int i = 0; i < prices.length; i++) {
            //condition bp<p[i], clc profit
            if(buyingPrice < prices[i]){
                int profit = prices[i] - buyingPrice;
                //clc max profit
                maxProfit = Math.max(maxProfit,profit);
            }
            else{
                //update byuing price 
                buyingPrice = prices[i];
            }
            
        }
        return maxProfit;
    }

    public static void main(String args[]){
        int prices[] = {7,6,5,4,3,2,50};
        System.out.println("Maximum profit in the transaction is: " + maxProfit(prices));
             
    }
}

/*Given n non-negative integers representing an elevation map where the
width of each bar is 1, compute how much water it can trap after raining.
*/
//height[] = {1,0,2,1,0,1,3,2,1,2,1}
//left max
//right max
//loop
//wateroneach
//trappedwater

public class arrayQue{
    public static int trappedWater(int height[]){
        int leftMax[] = new int[height.length-1];
        leftMax[0] = height[0];
        for (int i = 1; i < height.length; i++) {
            leftMax[i] = Math.max(height[i], leftMax[i-1]);
        }

        int rightMax[] = new int[height.length-1];
        rightMax[height.length-1] = height[height.length-1];
        for (int i = height.length-2; i >= 0; i--) {
          rightMax[i] = Math.max(height[i],rightMax[i+1]);
        }
        int trappedWater = 0;
        for (int i = 0; i < height.length; i++) {
            int waterLevel = Math.min(rightMax[i],leftMax[i]);
            trappedWater += waterLevel - height[i]; 
            
        }
        return trappedWater;
    }

    public static void main(String args[]){
        int height[] = {1,0,2,1,0,1,3,2,1,2,1};
        System.out.println("trapped water : "  + trappedWater(height));
    }
}

