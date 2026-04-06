import java.util.*;
public class Duplicate{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];

        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        List<Integer> result=new ArrayList<>();

        for(int i=0;i<n;i++){
            int index=Math.abs(arr[i])-1;

            if(arr[index]<0){
                result.add(index+1);
            }else{
                arr[index]=-arr[index];
            }
        }
        System.out.println(result);

    }
}