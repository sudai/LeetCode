/*
Given an array of integers, return indices of the two numbers such that they add up to a specific target.

You may assume that each input would have exactly one solution.

*/

//This is the  simplest way, should have more effective ways to solve the problem.
//I can use hashmap to get O(n) on time.

public class sumNums {
	public int[] twoSum(int[] nums, int target) {
        int[] arr = new int[2];
       
        for(int i=0;i<nums.length-1; i++){
            for(int j=i+1; j<nums.length; j++){
                
                if(nums[i]+nums[j]==target){
                    arr[0]=i;
                    arr[1]=j;
                    return arr;
                }
                    
            }
        }
        
        return arr;
    }
    
}


public class main {
	
	

	public static void main(String[] args) {
		
		 int[] numbers = { 0, 4, 2, 7 };  
	        int target = 9;  
	        int[] result = new sumNums().twoSum(numbers, target);  
	        for (int i = 0; i < result.length; i++) {  
	            System.out.println(result[i]);  
	        }  
		// TODO Auto-generated method stub

	}

}

//leetCode's answer
public int[] twoSum(int[] nums, int target) {
    Map<Integer, Integer> map = new HashMap<>();
    for (int i = 0; i < nums.length; i++) {
        map.put(nums[i], i);
    }
    for (int i = 0; i < nums.length; i++) {
        int complement = target - nums[i];
        if (map.containsKey(complement) && map.get(complement) != i) {
            return new int[] { i, map.get(complement) };
        }
    }
    throw new IllegalArgumentException("No two sum solution");
}



public int[] twoSum(int[] nums, int target) {
    Map<Integer, Integer> map = new HashMap<>();
    for (int i = 0; i < nums.length; i++) {
        map.put(nums[i], i);
    }
    for (int i = 0; i < nums.length; i++) {
        int complement = target - nums[i];
        if (map.containsKey(complement) && map.get(complement) != i) {
            return new int[] { i, map.get(complement) };
        }
    }
    throw new IllegalArgumentException("No two sum solution");
}

public int[] twoSum(int[] nums, int target) {
    Map<Integer, Integer> map = new HashMap<>();
    for (int i = 0; i < nums.length; i++) {
        int complement = target - nums[i];
        if (map.containsKey(complement)) {
            return new int[] { map.get(complement), i };
        }
        map.put(nums[i], i);
    }
    throw new IllegalArgumentException("No two sum solution");
}
