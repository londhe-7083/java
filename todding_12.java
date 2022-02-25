import java.util.Scanner;

public class todding_12{
    public static void main(String[] args){
            Scanner sc=new Scanner(System.in);
    //    char grade='b';
    int grade=sc.nextInt();
       grade=(char)(grade+8);
        System.out.println(grade);
        
        grade=(char)(grade-8);
        System.out.println(grade);
    }
}