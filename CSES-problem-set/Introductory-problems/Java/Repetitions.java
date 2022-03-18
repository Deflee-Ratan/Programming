import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.util.StringTokenizer;
import java.lang.*;

public class Repetitions{
    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        String dna = st.nextToken();
        int n = dna.length();
        char[] chdna = dna.toCharArray();
        int i=0,cnt=1, max_c=1;

        while(i<n-1){
            if(chdna[i]==chdna[++i]) cnt++;
            else{
                if(max_c<cnt) max_c = cnt;
                cnt = 1;
            } 
        }
        if(max_c<cnt) max_c = cnt;
        System.out.println(max_c);
    }
}