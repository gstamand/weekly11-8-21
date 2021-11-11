public class Main {

//    1) Given an array of integers representing stock price on single day, find max profit that can be earned by 1 transaction.
//    So you need to find pair (buyDay,sellDay) where buyDay < = sellDay and it should maximise the profit.
//    For example :
//
//    int arr[]={14, 12, 70, 15, 99, 65, 21, 90};
//    Max profit can be gain by buying at 1st day(0 based indexing) and sell at 4th day.
//    Max profit = 99-12 =87
//
//2) Create a function that takes an array of numbers and returns the greatest common factor of those numbers.
//
//    Examples
//    gcd({84, 70, 42, 56}) --> 14
//
//    gcd({19, 38, 76, 133}) --> 19
//
//    gcd({120, 300, 95, 425, 625}) --> 5
//    Notes
//    The GCD is the largest factor that divides all numbers in the array.

    public static void main(String[] args) {
        int arr[]={14, 12, 70, 15, 99, 65, 21, 90};
        System.out.println(maxProfit(arr));
        int arr2[]={66, 180, 4, 55, 0, 44, 100};
        System.out.println(maxProfit(arr2));

        int gcd1[] = {84, 70, 42, 56};
        System.out.println(gcd(gcd1));
        int gcd2[] = {19, 38, 76, 133};
        System.out.println(gcd(gcd2));
        int gcd3[] = {120, 300, 95, 425, 625};
        System.out.println(gcd(gcd3));
    }

    public static int maxProfit(int[] arr){

        int maxProfit = 0;
        int currentMin = arr[0];

        for(int i = 1; i < arr.length; i++){
            if(arr[i] < currentMin) currentMin = arr[i];
            else if(arr[i] - currentMin > maxProfit) maxProfit = arr[i] - currentMin;
        }
        return maxProfit;
    }

    public static int gcd(int[] arr){
        int maxInt = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] > maxInt) maxInt = arr[i];
        }
        int gcd = 0;
        for(int i = 1; i < (maxInt / 2); i++){
            boolean isFactor = true;
            for(int j = 0; j < arr.length; j++){
                if(arr[j] % i != 0) isFactor = false;
            }
            if(isFactor) gcd = i;
        }
        return gcd;
    }

}
