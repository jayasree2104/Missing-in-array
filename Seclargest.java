import java.util.Scanner;
public class Seclargest{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];

        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();             //[1,8,6,4,9] n=5
        }

        int largest=arr[0];
        int secondLargest=Integer.MIN_VALUE;

        for(int i=1;i<n;i++){               //i=1,2,3,4
            if(arr[i]>largest){               //arr[1]=8>1
                secondLargest=largest;          //secondLargest=1
                largest=arr[i];                  //largest=8
            }
            else if(arr[i]<largest && arr[i]>secondLargest){           //arr[2]=6<8 && 6>1
                secondLargest=arr[i];                                 //secondLargest=6
            }

        }
        System.out.println("Second largest is: "+secondLargest);

    }
}