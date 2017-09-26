package leetcode;

public class RemoveDuplicatesfromSortedArray {
	public int removeDuplicates(int[] nums) {
		int length=nums.length;
		int count=length;
		for(int i=0;i<length-1;i++)
		{
			if(nums[i]==nums[i+1])count--;
		}
		int item=0;
		int index=0;
		for(int i=0;i<length;i++)
		{
			if(item!=nums[i])
			{
				item=nums[i];
				nums[index]=item;
				index++;
			}
		}
        return 0;
    }
}
