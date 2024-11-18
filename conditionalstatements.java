import java.util.*;
import java.util.Scanner;

public class conditionalstatements{
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        int marks = sc.nextInt();
        System.out.println("Hi");
        
        if(marks>90)
            System.out.println("excellent");
        else if(marks>80)
            System.out.println("good");
        else if(marks>70)
            System.out.println("fair");
        else if(marks>60)
            System.out.println("fair");
        else{
            System.out.println("fail");
        }
        

    
    }
}