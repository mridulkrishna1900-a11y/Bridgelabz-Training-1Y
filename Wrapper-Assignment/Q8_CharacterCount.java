import java.util.*;
class Q8_CharacterCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int letters=0,digits=0,special=0;
        for(char c:s.toCharArray()) {
            if(Character.isLetter(c)) letters++;
            else if(Character.isDigit(c)) digits++;
            else if(!Character.isWhitespace(c)) special++;
        }
        System.out.println(letters+" "+digits+" "+special);
    }
}