class Q13_SensorData {
    static Double process(double d) {
        return d;
    }
    public static void main(String[] args) {
        double d=25.5;
        Double obj=process(d);
        double back=obj;
        System.out.println(obj+" "+back);
    }
}