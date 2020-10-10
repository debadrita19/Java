/* Given a gold mine of n*m dimensions. Each field in this mine contains a positive integer which is the amount of gold in tons. 
Initially the miner is at first column but can be at any row. He can move only (right->,right up /,right down\) that is from a given cell,
the miner can move to the cell diagonally up towards the right or right or diagonally down towards the right.
Find out maximum amount of gold he can collect.
*/

  
import java.util.LinkedList;
import java.util.Arrays;
public class GoldMine {

public static int goldMineDP(int[][] mat, int[][] dp) {

		for (int sc = mat[0].length - 1; sc >= 0; sc--) {
			for (int sr = mat.length - 1; sr >= 0; sr--) {

				if (sc == mat[0].length - 1) {
					dp[sr][sc] = mat[sr][sc];
					continue;
				}

				int cost = 0;
				cost = Math.max(cost, (sr - 1) < 0 ? 0 : dp[sr - 1][sc]);
				cost = Math.max(cost, dp[sr][sc]);
				cost = Math.max(cost, (sr + 1) >= mat.length ? 0 : dp[sr + 1][sc]);

				dp[sr][sc] = cost + mat[sr][sc];

			}
		}

		int maxAns = 0;
		for (int i = 0; i < mat.length; i++) {
			maxAns = Math.max(maxAns, dp[i][0]);
		}

		return maxAns;
    
    
    public static void main(String[] args) {
		 int gold[][]= { {1, 3, 1, 5}, 
                        {2, 2, 4, 1}, 
                        {5, 0, 2, 3}, 
                        {0, 6, 1, 2} }; 
                        
        int[][] dp = new int[mat.length][mat[0].length];
		int maxAns = 0;
    
     maxAns=goldMineDP(mat,dp);

		return maxAns;
	}
 }
