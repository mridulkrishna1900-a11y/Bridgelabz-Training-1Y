class Q6_SafeParse {
    public static int safeParseInt(String input) {
        try {
            return Integer.parseInt(input);
        } catch(Exception e) {
            return -1;
        }
    }
    public static void main(String[] args) {
        String[] arr = {"123","abc","45.6","0"};
        for(String s: arr) {
            System.out.println(s + " -> " + safeParseInt(s));
        }
    }
}