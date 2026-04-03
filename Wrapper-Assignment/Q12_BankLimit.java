class Q12_BankLimit {
    static double remaining(Double limit) {
        if(limit==null) return 0.0;
        return limit;
    }
    public static void main(String[] args) {
        System.out.println(remaining(500.0));
        System.out.println(remaining(null));
    }
}