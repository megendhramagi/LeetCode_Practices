class MajaroityELement{

    static int majEle(int[] arr){

        int count=0;
        int a[]=new int[2];
        //try using array instead of hashmap

        for(int i=0;i<arr.length;i++){
            if(a[0]!=arr[i]){
                for(int j=i;j<arr.length;j++){
                    if(arr[i]==arr[j]){
                        count++;
                    }
                }
                if(count>a[1]){
                    a[0]=arr[i];
                    a[1]=count;
                }
                count=0;
            }

        }
        return a[0];
    }
//working but not working all the time
    static int majEle2(int[] arr,int start,int maj){

        int count=0;
         for(int i=start;i<arr.length;i++){
            if(arr[i]==maj){
                count++;
            }else{
                count--;
            }
            if(count<0){
                majEle2(arr, i, arr[i]);
            }
         }

        return maj;
    }


    public static void main(String[] args){
        int[] arr={2,2,1,1,1,2,2};
        System.out.println(majEle(arr));
        System.out.println(majEle2(arr, 0, arr[0]));
    }
}