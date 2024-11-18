import java.util.*;

public class primenumbers{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out. println("Enter the number t?");
        int t =sc.nextInt();
        
            //div*div<=n- written in this way because if we can only upto root n it is enough. We dont need to check any more.
            //For example 49 if we check upto 7 it is enough.
            //break is written because we can break the loop when the count is 1.
        
        for(int i=0;i<t;i++){
            int n=sc.nextInt();
            int count=0;
            for(int j=2;j*j<=n;j++){
                if(n%j==0)
                {
                    count++;
                    break;
                }
            }
        if(count ==0){
            System.out.println("prime");
        }
        else{
            System.out.println("not prime");
        }
        }
            
        
    }
}