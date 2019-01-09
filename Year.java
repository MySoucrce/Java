public class Year {
    public static void main(String[] args){
        for(int year =100; year< 1000; year++){
            if(year % 400 == 0  || (year %4 == 0 && year % 100 != 0)){
                System.out.println(year);
            }
        }
    }


}
