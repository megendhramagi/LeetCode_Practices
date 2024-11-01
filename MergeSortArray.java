public class MergeSortArray {

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int p=m-1;
        int q=n-1;
        while(p+q+1>=0){
            if(p==-1){
                for(int i=0;i<=q;i++){
                    nums1[i]=nums2[i];
                }
                break;
            }
            else if(q==-1){
                break;
            }
            else if(nums2[q]>nums1[p]){
                nums1[p+q+1]=nums2[q];
                q--;
            }
            else{
                nums1[p+q+1]=nums1[p];
                p--;
            }

        }
    }


    public static void main(String[] args) {

        int nums1[]={1,2,3,0,0,0};
        int nums2[]={};
        //merge array {1,2,3,2,5,6} //sorted array {1,2,2,3,5,6}

        int m=3,n=3;

       for(int i=0;i<n;i++){
        nums1[m+i]=nums2[i];
       }

       for(int i=0;i<nums1.length;i++){
            for(int j=i+1;j<nums1.length;j++){
                System.out.println(nums1[i]+" > "+nums1[j]+" "+(nums1[i]>nums1[j]));

                if(nums1[i]>nums1[j]){
                    int temp=nums1[j];
                    nums1[j]=nums1[i];
                    nums1[i]=temp;
                }
            }

       }

        
        for(int a:nums1){
            System.out.print(a);
        }
    }
    
}
