package Bank;

public class DsaProblems {
    public static void main(String[] args) {
        int arr[]={10,99,666,223,448};

        int largest=Integer.MIN_VALUE;
        int secondLargest=Integer.MIN_VALUE;

        for(int num : arr){
            if(num > largest){
                secondLargest = largest;
                largest=num;
            } else if (num > secondLargest) {
                secondLargest=num;
            }
        }
        System.out.println("Second Largest number is : " + secondLargest);
    }
}
