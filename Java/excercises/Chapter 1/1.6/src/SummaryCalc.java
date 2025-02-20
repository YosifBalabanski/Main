public class SummaryCalc {//returns the sum from 1 to the end if end is 5 it will return the result of 1+2+3+4+5
    public static void sCalc(int end){
        if(end<=0) {
            System.out.printf("'%d' is not a Valid input",end);
        }else {
            int sum = 0;
            for (int i = 1; i < end + 1; i++) {
                sum += i;
            }
            System.out.println(sum);
        }
    }
}
