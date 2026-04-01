import java.util.Scanner;
public class Missing{
    public static void main(String args[]){

        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int[] arr=new int[n-1];

        int sum=0;

        for(int i=0;i<n-1;i++){
            arr[i]=scan.nextInt();
            sum=sum+arr[i];
        }
            
            int expectedSum=n*(n+1)/2;
            System.out.println("Missing number is: "+(expectedSum-sum));


        }
    }
