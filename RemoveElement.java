public class RemoveElement {

    static void removeElement(int nums[],int val){

        int c=nums.length-1;
        
        for(int i=0;i<nums.length;i++){
            if (nums[i]==val) {
                nums[i]=-1;

                int temp=nums[i];
                nums[i]=nums[c];
                nums[c]=temp;

                c--;
                i--;
            }

        }
        for(int a:nums){
            System.out.print(a+" ");
        }
        System.out.println("\n"+(c+1));

    }

    public static void main(String[] args) {
         int nums[]={0,1,2,2,3,0,4,2};
         int val=2;
        // int k=nums.length;

        // for(int i=0;i<nums.length;i++){
        //     if(nums[i]==val){
        //         nums[i]=0;
        //         k--;
        //     }
        // }
        // for(int a:nums){
        //     System.out.print(a+" ");
        // }
        // System.out.println("\n"+k);

        removeElement(nums, val);
    }
    
}
