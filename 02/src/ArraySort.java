public class ArraySort {

    public static void main(String[] args) {
        int[] array = {30, 2, 10, 4, 6};
        int length = array.length;

        //PUT YOUR CODE HERE
        for(int i = 1; i < array.length; i++)
        {
            for(int j=i;j>=1;j--)
            {
                int a =  array[j];
                array[j]= array[j-1];
                array[j-1] = a;
            }
        }
        for(int i = 1; i< array.length;i++)
        {
            for(int j=i;(j>=1)&&(array[j]<array[j-1]);j--)
            {
                int a =  array[j];
                array[j]= array[j-1];
                array[j-1] = a;
            }
        }
        
        //PUT YOUR CODE HERE

        for (int i = 0; i < length; i++) {
            System.out.print(array[i] + " ");
        }
    }
} 
