
import java.util.*;
import java.lang.*;
class HelloWorld {
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int ar[]=new int[n];
      
      String name=sc.nextLine();
      String type=sc.nextLine();
      String date=sc.nextLine();
      
      for(int i=0;i<n;i++){
        
               ar[i]=sc.nextInt();
          
      }
      //int temp=Math.max();
      
      for(int i=0;i<n;i++){
          if(ar[i]>=0){
              
            System.out.println("Topic" + i+ "maximum " + type + "reviews" );
          }
          else if(ar[i]<=0){
              System.out.println("Topic" + i+ "maximum " + type + "reviews" ) ;
          }
          else if(ar[i]==0){
              System.out.println("Topic" + i+ "maximum " + type + "reviews" );
          }
      }
      
      
    }
}