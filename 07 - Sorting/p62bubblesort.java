public class p62bubblesort {

    public static void bubbleSort(int nums[]){
        for(int turn=0;turn<nums.length-1;turn++){
            for(int j=0;j<nums.length-1-turn;j++)
            {
                if(nums[j]>nums[j+1])
                {
                    // swap
                    int temp;
                    temp=nums[j];
                    nums[j]=nums[j+1];
                    nums[j+1]=temp;

                }
            }        
}
    }
    
    public static void printArr(int nums[]){
        for(int i=0;i<nums.length;i++)
        {
            System.out.print(nums[i]+ " ");
        }

    }
    
    public static void main(String[] args) {
        int nums[]={5,4,1,3,2};
        bubbleSort(nums);
        printArr(nums);
    }

}