import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.lang.Long;

public class WeirdAlgorithm
{
	public static void main(String[] args)throws IOException
    {
 
        BufferedReader br = new BufferedReader(
            new InputStreamReader(System.in));
 
        StringTokenizer st
            = new StringTokenizer(br.readLine());
        long n = Long.parseLong(st.nextToken());
    
        
        while(n>1){
            
            System.out.print(n);
            System.out.print(" ");
            if(n%2==0){
                n = n/2;
            }    
            else{
                n = (n*3) + 1;
            }
                
        }
        System.out.println(1);
	}
}
