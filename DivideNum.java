import java.util.Scanner;
//：输入一行字符，分别统计出其中英文字母、空格、数字和其它字符的个数。
public class DivideNum {
    public static void main(String[] args){
        int countNum = 0;
        int countChar = 0;
        int countSpace = 0;
        int countOther = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一行字符： ");
        String str = scanner.nextLine();
        char[] ch = str.toCharArray();
        /*
        for(int i = 0; i < ch.length; i++){
            if(ch[i] >= '0' && ch[i] <= '9'){
                countNum++;
            }else if((ch[i] >= 'a' && ch[i] <= 'z') || (ch[i] >= 'A' && ch[i] <= 'Z') ){
                countChar++;
            }else if(ch[i] == ' '){
                countSpace++;
            }else {
                countOther++;
            }
        }*/
        for(int i = 0; i < ch.length; i++){
            if(Character.isDigit(ch[i])){
                countNum++;
            }else if(Character.isLetter(ch[i])){
                countChar++;
            }else if(Character.isSpaceChar(ch[i])){
                countSpace++;
            }else{
                countOther++;
            }
        }
        System.out.println("数字个数为：" + countNum);
        System.out.println("字符个数为：" + countChar);
        System.out.println("空格个数为：" + countSpace);
        System.out.println("其他个数为：" + countOther);
    }

}
