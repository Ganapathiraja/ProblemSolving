package recurssion;

public class ReverseString {

    private static String result;

    public static void main(String[] args) {

     int n=5;
    // solution(n);
    // int sum=0;
        System.out.println(addNumbs(n));
        System.out.println(squareRoot(3,4));

        String str = "abcd";

        System.out.println(str);

        System.out.println("Find the End of the path");

        System.out.println(reverseString(str));



        int row = 3;
        int col = 3;





        System.out.println(findTheDestination(row,col));


        // 3 is alive 
        System.out.println(josephusSolution(5,3));


    }

    private static int josephusSolution(int n, int k) {

        if (n==1){
            return 0;
        }

        int result = (josephusSolution(n-1,k)+k)%n;
        return result;



    }

    private static int findTheDestination(int row, int col) {

        if (row == 1 || col == 1){
            return 1;
        }

        int result = findTheDestination(row,col-1) + findTheDestination(row-1,col);
        return result;

    }

    private static int squareRoot(int num,int power) {

        if (power == 0){
            return 1;
        }

        int result = num*squareRoot(num,power-1);

        return result;


    }

    static int sum=0;
    private static int addNumbs(int n) {

        if (n==1){
            return n;
        }

         sum = addNumbs(n-1)+n;
        System.out.println(sum);
        return sum;

    }

   static String res = "";

    private static String reverseString(String str) {

       if (str.length() < 1){

           return str;
       }

        res +=str.charAt(str.length()-1);
        reverseString(str.substring(0,str.length()-1));
        return res;

    }
}
