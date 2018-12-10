public class Before {
    public static void main(String[] args){
        System.out.println(getSubstr("hello", "oe"));
    }
    public static boolean getSubstr(String str1, String str2){
        int length1 = str1.length();
        int length2 = str2.length();
        int minLength = length1 < length2 ? length1 : length2;
        for(int i = 0; i < minLength ; i++){
            char c1 = str1.charAt(i);
            char c2 = str2.charAt(i);
            if(c1 != c2){
                return false;
            }
        }
        return true;
    }


}
