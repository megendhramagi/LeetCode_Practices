import java.util.Arrays;

public class SetMatrixZero {
    

    static void checkMatixZero(int[][] arr){

        int brr[][]=new int[arr.length][arr[0].length];
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                brr[i][j]=arr[i][j];
                
            }

        }
        for(int i=0;i<brr.length;i++){
            for(int j=0;j<brr[i].length;j++){
                if(brr[i][j]==0){

                    for(int k=0;k<brr.length;k++){
                        arr[k][j]=0;
                        arr[i][k]=0;
                        System.out.println(k);
                    }   

                } 

            }

        }
        for(int b[]:brr){
            System.out.println(Arrays.toString(b));
        }
    }


    public static void main(String[] args) {

        int arr[][]={{0,2,3,0},{4,5,6,6},{7,8,8,9}};
         checkMatixZero(arr);
         
         for(int a[]:arr){
            System.out.println("\n"+Arrays.toString(a));
         }
    }
    
}
