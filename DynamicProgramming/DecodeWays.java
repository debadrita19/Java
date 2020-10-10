/* Leetecode 91

A message containing letters from A-Z is being encoded to numbers using the following mapping:
'A' -> 1
'B' -> 2
...
'Z' -> 26

Given a non-empty string containing only digits, determine the total number of ways to decode it.
*/
class DecodeWays{
public:
    public static int numDecodings(String s) {
		int[] dp=new int[s.length()+1];
		
		return numDecodings_DP(s,dp);
		
	}
  
public static int numDecodings_DP(String s,int[] dp) {
		for(int idx=s.length();idx>=0;idx--){

			if(idx==s.length()){
				dp[idx]=1;
				continue;
			}

			char ch=s.charAt(idx);
			int count=0;
			if(ch!='0')
			   count+=dp[idx+1];
	
			if(idx+1<s.length()){
				char ch2=s.charAt(idx+1);
				int val=(ch-'0')*10 + (ch2-'0');
				  if(val>=10 && val<=26)
					count+=dp[idx+2];
			}
	
		    dp[idx]=count;	
		}

		return dp[0];
    }
    
   }
    
