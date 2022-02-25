import java.util.Scanner;

public class solvemarks_11{
        public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("enter your physics marks :");
        int physics = scan.nextInt();
        System.out.println("enter your english :");
        int english = scan.nextInt();
        System.out.println("enter your chemistry :");
        int chemistry = scan.nextInt();
        System.out.println("enter your biology :");
        int biology = scan.nextInt();
        System.out.println("enter your compnet :");
        int compnet = scan.nextInt();

        float percentage = ((physics+english+chemistry+biology+compnet)/500.0f)*100;
        
        System.out.println("percentage:-");
        System.out.println(percentage);

     }

    
}
