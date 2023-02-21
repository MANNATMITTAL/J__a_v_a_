public class Two_matric{
    public static void main(String args[]){
       int a[][]={{1,5,7},{4,7,8},{7,4,6}};
       int b[][]={{1,1,1},{1,1,1},{1,1,1}};
       int c[][]=new int[3][3];
 
       for(int i = 0;i<3;i++){
          for(int j = 0;j<3;j++){
             c[i][j] = a[i][j]+b[i][j];
             System.out.println(c[i][j]+" ");
          }
          System.out.println();
       }
    }
 }
