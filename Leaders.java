import java.util.Scanner;
public class Leaders {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];

        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        arr[n-1]=Integer.MIN_VALUE;

        for(int i=n-2;i>=0;i--){
            if(arr[i]>arr[i+1]){
                System.out.println("Leader is: "+arr[i]);
            }
                else{
                    arr[i]=arr[i+1];
                }
        }

    }
    
}
