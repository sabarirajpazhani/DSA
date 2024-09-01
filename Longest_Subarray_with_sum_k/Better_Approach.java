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

