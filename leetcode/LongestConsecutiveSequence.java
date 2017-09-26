package leetcode;

import java.util.HashMap;

public class LongestConsecutiveSequence {
    public int longestConsecutive(int[] nums) {
    	HashMap<Integer, Boolean> hm = new HashMap<Integer, Boolean>();
    	int length=nums.length;
    	for(int i=0;i<length;i++)
    	{
    		//hm.get(nums)
    	}
    	return 0;
    }
	public static void main(String []args)
	{
		int []input=new int[6];
		input[0]=100;
		input[1]=4;
		input[2]=200;
		input[3]=1;
		input[4]=3;
		input[5]=2;
		LongestConsecutiveSequence s=new LongestConsecutiveSequence();
		System.out.println(s.longestConsecutive(input));
	}
}
