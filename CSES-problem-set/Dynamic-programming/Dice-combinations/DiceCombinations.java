import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class DiceCombinations{
    static final int con = 1000000007;
    public static void main(String args[]) throws IOException{
        PrintWriter pw = new PrintWriter(System.out);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        

        long arr[] = new long[n+1];
        arr[0] = 1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=6;j++){
                if(i-j >= 0){
                    arr[i] = (arr[i]+arr[i-j])%con;
                }
            }
        }
        pw.println(arr[n]);
        pw.close();
    }
}