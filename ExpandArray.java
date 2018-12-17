import java.util.ArrayList;
import java.util.Scanner;

public class ExpandArray {
    public static void main(String[] args){
        ArrayList<String> array = getStrings();
        for(int i = 0; i < array.size(); i++){
            System.out.println(array.get(i));
        }
    }
    public static ArrayList<String> getStrings(){
        Scanner in = new Scanner(System.in);
        ArrayList<String> array = new ArrayList<>();
        System.out.println("enter any number of strings ,one per line: ");
        System.out.println("Terminate with empty line : ");

        while(in.hasNextLine()){
            String oneline = in.nextLine();
            if(oneline.equals(" ")){
                break;
            }
            array.add(oneline);
        }
        System.out.println("Done reading");
        return array;
    }
}
