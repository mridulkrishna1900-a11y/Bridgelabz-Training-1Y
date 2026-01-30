public class names {
    public static void main(String[] args) {
        String str = "aman,odd,add";
        
        
        String[] names = str.split(",");
        for (String name : names) {
            System.out.println(name);
        }
    }
}
