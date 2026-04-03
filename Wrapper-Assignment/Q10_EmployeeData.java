import java.util.*;
class Q10_EmployeeData {
    public static void main(String[] args) {
        int[] arr={25,30,18,40};
        ArrayList<Integer> list=new ArrayList<>();
        for(int a:arr) list.add(a);
        System.out.println(Collections.min(list));
        System.out.println(Collections.max(list));
    }
}