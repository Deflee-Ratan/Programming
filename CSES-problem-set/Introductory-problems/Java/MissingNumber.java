import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.lang.*;

public class MissingNumber{

    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int a[] = new int[n+1];

        st = new StringTokenizer(br.readLine());
        
        while (st.hasMoreTokens())     
            a[Integer.parseInt(st.nextToken())] = 1;
            
        for(int i=1;i<=n;i++){
            if(a[i] == 0){
                System.out.println(i);
                break;
            }
        }


    }

}