import java.util.Arrays;

public class RotateArray {

    static int[] rotateA(int arr[],int k){

        int rotArr[] =new int[arr.length];

        for(int i=0;i<arr.length;i++){
            if(i<k){
            rotArr[i]=arr[(arr.length-k)+i];
            }else{
                rotArr[i]=arr[i-k];
            }
        }
        return rotArr;
    }


    static int[] rotateB(int arr[],int k){

        int rotArr[]=new int[arr.length];
        
        int x = k % arr.length;//2

        for(int i=0;i<arr.length;i++){
            rotArr[(i+x)%arr.length]=arr[i];
        }

        return rotArr;
    }


    public static void main(String[] args) {

        int[] arr={3,99,-1,-100,12,-100}; //3,99,-1,-100 k=2
        System.out.println(arr.length);
        System.out.println(Arrays.toString(rotateA(arr, 2)));
        System.out.println(Arrays.toString(rotateB(arr, 2)));

        

        
    }
    
}
