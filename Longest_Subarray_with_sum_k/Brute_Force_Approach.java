import java.util.* ;
import java.io.*; 
public class Brute_Force_Approach {
	public static int getLongestSubarray(int []nums, int k) {
		// Write your code here.
		int len=0;
		for(int i=0;i<nums.length;i++){
			int sum=0;
			for(int j=i;j<nums.length;j++){
				sum+=nums[j];

				if(k==sum){
					len=Math.max(len, j-i+1);
				}
			}
			
		}
		return len;
	}
}

// Sample Input 1 :
// 2
// 3 5
// 2 3 5
// 3 1
// -1 1 1
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

//Link :https://www.naukri.com/code360/problems/longest-subarray-with-sum-k_5713505?interviewProblemRedirection=true&search=Longest%20Subarray%20With%20Sum%20k&leftPanelTabValue=PROBLEM