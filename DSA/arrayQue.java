/* 
    1. Trapped Water 
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