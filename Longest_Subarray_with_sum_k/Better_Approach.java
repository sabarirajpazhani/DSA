import java.util.* ;
import java.io.*; 
public class Better_Approach {
	public static int getLongestSubarray(int []nums, int k) {


		HashMap<Integer,Integer> m = new HashMap<>();
		int len=0;
		int sum=0;
		for(int i=0;i<nums.length;i++){
			sum+=nums[i];
			if(sum==k){
				len=Math.max(len,i+1);
			}
			int rem=sum-k;
			if(m.containsKey(rem)){
				len=Math.max(len,i-m.get(rem));
			}
			if(!m.containsKey(sum)){
				m.put(sum,i);
			}
		}
		return len;
	}
}	


// Sample Output 1 :
// 2
// 3
// Explanation Of Sample Input 1 :
// For the first case:
// There are two subarrays with sum = 5, [2, 3] and [5]. Hence the length of the longest subarray is 2.

// For the second case:
// Longest subarray with sum = 1 is [1, -1, 1].
// Sample Input 2 :
// 2
// 3 4
// 1 1 1
// 3 2
// -50 0 52
// Sample Output 2 :
// 0 
// 3

//LINK: https://naukri.com/code360/problems/longest-subarray-with-sum-k_5713505?interviewProblemRedirection=true&search=Longest%20Subarray%20With%20Sum%20k&leftPanelTabValue=PROBLEM