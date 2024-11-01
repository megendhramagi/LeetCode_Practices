import java.util.Arrays;
import java.util.HashMap;

class SumPrg{
    
    //for method 2
    static int[] summA(int arr[],int target){

        HashMap<Integer,Integer> hmap=new HashMap<>();
         for(int i=0;i<arr.length;i++){
            
            int compliment=target-arr[i];
            
            if(hmap.containsKey(compliment)){
                System.out.println(hmap);
                return new int[]{hmap.get(compliment),i};
            }
            hmap.put(arr[i],i);
         }

         return null;
    }

    public static void main(String[] args) {
        int[] arr={0,2,11,-2,15};
        int target=0;
        boolean isFound=false;

        for(int i=0;i<arr.length-1;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]+arr[j]==target){
                    System.out.println("a["+i+"]("+arr[i]+") + a["+j+"]("+arr[j]+") = "+target);
                    isFound=true;
                }
            }
        }
        if(!isFound){
            System.out.println("The SUm of "+target+" NOt found in the arary");
        }

        //another method alse easy method
        System.out.println(Arrays.toString(summA(arr, target)));
    }
}