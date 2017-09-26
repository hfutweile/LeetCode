package leetcode;

public class containMostWater {
    public int maxArea(int[] height) {
        int length=height.length;
        int max=0;
        int area=0;
        int i=0;
        int j=length-1;
        while(i!=j)
        {
        	area=Math.min(height[i],height[j])*(j-i);
        	if(height[i]>height[j]){
        		j--;
        	}
        	else i++;
        	if(area>max)max=area;
        }
         /*for(int i=0;i<length;i++)
         {
             for(int j=i+1;j<length;j++)
             {
                 area=Math.min(height[i],height[j])*(j-i);
                 if(area>max)max=area;
             }
         }
         */
         return max;
     }
}
