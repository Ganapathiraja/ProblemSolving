package recurssion;

public class Fibbonacci {

    public static void main(String[] args) {

        int ans =  fibbo(4);

        System.out.println(ans);


    }

    private static int fibbo(int num) {

        if (num < 2){
            return num;
        }

        int first = fibbo(num-1);

        int second = fibbo(num-2);

        int result = first+second;
        return result;
    }
}
