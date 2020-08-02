import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/*Given an array of integers, return indices of the two numbers such that they add up to a specific target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.

Example:

Given nums = [2, 7, 11, 15], target = 9,

Because nums[0] + nums[1] = 2 + 7 = 9,
return [0, 1].
*/


public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        
        Map<Integer,Integer> map=new HashMap<>();
        int[] output=new int[2];
        for(int i=0;i<nums.length;i++){
            int random=target-nums[i];
            if(map.containsKey(random)){
            	output[0]=i;
                output[1]=map.get(random);
                break;
            }
            map.put(nums[i],i);
        }
        return output;
    }

	public static void main(String[] args) {
		TwoSum two=new TwoSum();
		int[] array=two.twoSum(new int[]{2,7,11,15},9);
		System.out.println(Arrays.toString(array));
		Arrays.stream(array).forEach(System.out::println);
		
	}
}
