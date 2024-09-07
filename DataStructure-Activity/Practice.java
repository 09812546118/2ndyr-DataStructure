public class Practice {
    public static void main(String...args) { 
      int n=5;
      // index: 0 to < n
      // j: 0 1 2 3 4
      //for(int j=0; j<n; j++){
       //  System.out.print("*");
     // }
     // index:1 to <= n
     // j: 1 2 3 4 5
     for(int i=1; i<=n; i++){
        for(int j=i; j<=n; j++){
         System.out.print("* ");
       }
       System.out.println();
     }
    
    }

}

     
