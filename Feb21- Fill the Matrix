class Solution
{
	public static int minIteration(int n, int m, int x, int y){
		//code here
    //Time Complexity- O(1)
    //Space Complexity- O(1)
		/*
		x-1 (distance to top boundary)
        n-x (distance to bottom boundary)
        y-1 (distance to left boundary)
        m-y (distance to right boundary)
        */
        
        // distance from corner
       int c1 = x-1+y-1; //distance from 1st corner
       int c2 = x-1+m-y; //distance from 2nd corner
       int c3 = n-x+y-1; //distance from 3rd corner
       int c4 = n-x+m-y; //distance from 4th corner
       
       //maximum distant corner will be the minimum number of iteration
	   return Math.max(Math.max(c1,c2),Math.max(c3,c4));
	}
}
