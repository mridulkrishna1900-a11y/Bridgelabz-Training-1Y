import java.util.*;
class Q14_ProductRatings {
    public static void main(String[] args) {
        int[] arr={4,5,3};
        ArrayList<Integer> list=new ArrayList<>(Arrays.asList(5,null,4));
        ArrayList<Integer> all=new ArrayList<>();
        for(int a:arr) all.add(a);
        for(Integer i:list) if(i!=null) all.add(i);
        double sum=0;
        for(int i:all) sum+=i;
        System.out.println(sum/all.size());
    }
}