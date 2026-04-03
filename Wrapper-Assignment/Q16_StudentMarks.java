import java.util.*;
class Q16_StudentMarks {
    public static void main(String[] args) {
        Object[] data={"85",95,Integer.valueOf(88),"null"};
        ArrayList<Integer> list=new ArrayList<>();
        for(Object o:data) {
            try {
                if(o instanceof String) {
                    String s=(String)o;
                    if(s.equals("null")) continue;
                    list.add(Integer.parseInt(s));
                } else list.add((Integer)o);
            } catch(Exception e){}
        }
        double sum=0;
        for(int i:list) sum+=i;
        System.out.println(sum/list.size());
    }
}