import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.util.StringTokenizer;
import java.lang.Long;

public class IncreasingArray{
    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        long ans=0,diff=0;
        st = new StringTokenizer(br.readLine());
        long arr[] = new long[n];
        arr[0] = Integer.parseInt(st.nextToken());
        for(int i=1;i<n;i++){
            arr[i] = Long.parseLong(st.nextToken());
            if(arr[i-1]>arr[i]){
                diff = arr[i-1]-arr[i];
                arr[i] = arr[i-1];
                ans = ans+diff;
            }
        }
        System.out.println(ans);
    }
}