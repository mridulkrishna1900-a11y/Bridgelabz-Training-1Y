import java.util.*;
class Q17_Performance {
    public static void main(String[] args) {
        int n=1000000;
        long start,end,sum=0;
        
        int[] arr=new int[n];
        start=System.currentTimeMillis();
        for(int i=0;i<n;i++) arr[i]=i;
        for(int i:arr) sum+=i;
        end=System.currentTimeMillis();
        System.out.println("Array time: "+(end-start));
        
        ArrayList<Integer> list=new ArrayList<>();
        sum=0;
        start=System.currentTimeMillis();
        for(int i=0;i<n;i++) list.add(i);
        for(int i:list) sum+=i;
        end=System.currentTimeMillis();
        System.out.println("ArrayList time: "+(end-start));
    }
}