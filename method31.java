import java.util.Scanner;
public class method31{
  static int logic (int x , int y ){
      int z;
      if (x>y){
          z=x+y;
      }
      else 
       z=(x+y)*5;

      return z;
  }


    public static void main(String[] args){ 
        System.out.print("enter a values:-");
   Scanner sc= new Scanner(System.in);
   int a= sc.nextInt();
   int b= sc.nextInt();
   int c;
   c=logic(a,b);
       System.out.print("ans is  ");
       System.out.println(c);
        // int a=4;
        // int b=8;
        // int c=a+b;
        // System.out.println(c);

                  


    }
}