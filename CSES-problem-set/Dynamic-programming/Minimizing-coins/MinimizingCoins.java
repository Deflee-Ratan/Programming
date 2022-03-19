import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class MinimizingCoins{
    static final int inf = 1000007;
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        PrintWriter pw = new PrintWriter(System.out);
        int n = Integer.parseInt(st.nextToken());
        int x = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        int c[] = new int[n+1];
        int n_c[] = new int[x+1];
        for(int i=1;i<=n;i++)
            c[i] = Integer.parseInt(st.nextToken());
        
        for(int i=1;i<=x;i++){
            for(int j=1;j<=n;j++){
                if(n_c[i]==0) n_c[i] = inf;
                if(i-c[j] >= 0){
                    n_c[i] = min(n_c[i],n_c[i-c[j]]+1);
                }
            }
            
        }
        if(n_c[x]==inf) System.out.println(-1);
        else System.out.println(n_c[x]);


    }
    static int min(int a, int b){
        return a<b?a:b;
    }
}