public class p50linearsearch {

    public static int linear(int numbers[],int key)
    {
        for(int i=0;i<numbers.length;i++)
        {
            if(numbers[i]==key){
                return i;
            }

        }
        return -1;
    }
    public static void main(String[] args) {
        int numbers[]={2,4,5,7,10,12,13,15};
        int key=10;

        int index=linear(numbers, key);
        if(index==-1)
        {
            System.out.println("Not found");

        }
        else
        {
            System.out.println("Key is at index " + index);
        }
    }
}
