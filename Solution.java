
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;


public class Solution {
static int carDistribution(int n, int[] ar) {
// Complete this function
int ans =0, max =-1;

int[] cateogarized = new int[6];

for(int i =0;i<n;i++){

    cateogarized[ar[i]] ++;

}

for (int i=1;i<6;i++){
    if (max < cateogarized[i]){
        max = cateogarized[i];
        ans = i;
    }

}


return ans;
 
}



public static void main(String[] args) {
Scanner in = new Scanner(System.in);
int n = in.nextInt();
int[] ar = new int[n];
for(int ar_i = 0; ar_i < n; ar_i++){
ar[ar_i] = in.nextInt();
}
int result = carDistribution(n, ar);
System.out.println(result);
}
}