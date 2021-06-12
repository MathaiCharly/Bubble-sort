import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

class Result {

    /*
     * Complete the 'countSwaps' function below.
     *
     * The function accepts INTEGER_ARRAY a as parameter.
     */

    public static void countSwaps(List<Integer> a) {
    // Write your code here
    int s=0;
    int k;
    int n=a.size();
    int[] b=new int[n];
    for (int f =0; f<n; f++)
            b[f] = a.get(f);
    for (int i = 0; i < n; i++)
     {
         for (int j = 0; j < n - 1; j++) 
         {
        // Swap adjacent elements if they are in decreasing order
        if (b[j] > b[j + 1]) 
        {
            k=b[j];
            b[j]=b[j+1];
            b[j+1]=k;
            s=s+1;
        }
    }
    
}
System.out.println("Array is sorted in "+s+" swaps.");
System.out.println("First Element: "+b[0]);
System.out.println("Last Element: "+b[n-1]);
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        String[] aTemp = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        List<Integer> a = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int aItem = Integer.parseInt(aTemp[i]);
            a.add(aItem);
        }

        Result.countSwaps(a);

        bufferedReader.close();
    }
}

