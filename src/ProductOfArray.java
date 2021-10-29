import java.util.Arrays;

public class ProductOfArray {

    public static void main(String[] args) {

        int array[] = new int[]{1,2,3,4};
        int[] products = new int[array.length];

        int leftRunningProduct=1;
        for(int i=0;i<array.length;i++)
        {
            products[i]=leftRunningProduct;
            leftRunningProduct*=array[i];
        }

        System.out.println(Arrays.toString(products) +" Product");
        System.out.println(Arrays.toString(array)+" array");

        //1 1 2 6
        int rightRunningProduct=1;
        for(int i=array.length -1;i>=0;i--)
        {
            products[i] = products[i] * rightRunningProduct;
            rightRunningProduct = rightRunningProduct * array[i]; // array = 1 2 3 4
        }
        System.out.println(Arrays.toString(products));

    }
}
