class Q15_GameScore {
    public static void main(String[] args) {
        Integer[] scores={10,null,20,null};
        int count=0,sum=0;
        for(Integer s:scores) {
            if(s==null) count++;
            else sum+=s;
        }
        System.out.println(count);
        System.out.println(sum);
    }
}