/*

Given an array of n integers. The task is to remove or delete the minimum number of elements from the 
array so that when the remaining elements are placed in the same sequence order to form an increasing sorted sequence.

*/


class MinDeletions{ 
 public static void main (String[] args)  
    { 
        int arr[] = {30, 40, 2, 5, 1, 
                       7, 45, 50, 8}; 
        System.out.println("Minimum number of" + 
                               " deletions = " + minimum_No_of_deletion(arr) ); 
    } 
public static int minimum_No_of_deletion(int[] arr){
		int n=arr.length;
		int[] dp=new int[n];

		dp[0] = 1;
		int maxLen = 0;
		for (int i = 1; i < arr.length; i++) {
			dp[i] = 1;
			for (int j = 0; j < i; j++) { 
				if (arr[i] >= arr[j]) { 
					dp[i] = Math.max(dp[i], dp[j] + 1);
				}
			}
			maxLen = Math.max(maxLen, dp[i]);
		}

		return n-maxLen;
	}
  }
