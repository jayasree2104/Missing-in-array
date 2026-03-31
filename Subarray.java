import java.util.*;
public class Subarray {
    static ArrayList<Integer> subarraySum(int[] arr, int target){
        ArrayList<Integer> result = new ArrayList<>();
        
        int sum = 0;
        int start = 0;
        
        for(int end = 0; end < arr.length; end++){
            sum = sum + arr[end];
            
            while(sum > target){
                sum = sum - arr[start];
                start++;
            }
            if(sum == target){
                result.add(start + 1);
                result.add(end + 1);
                return result;
            }
        }
        result.add(-1);
        return result;
    }
    
    public static void main(String[] args) {
       
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];

        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int target=sc.nextInt();
        ArrayList<Integer> result=subarraySum(arr,target);
        for(int i=0;i<result.size();i++){
            System.out.print(result.get(i)+" ");    

        }
    }
}
