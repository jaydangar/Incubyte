import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class LeapYearChecker{
    public static void main(String[] args) throws Exception{
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(args[0])));

        while(true){

            String strYear = bufferedReader.readLine();
            if(strYear==null){
                bufferedReader.close();
                return;
            }

            int year = Integer.parseInt(strYear);
            if(year<0){
                throw new Exception("Year cannot be negative.");
            }

            String leapYearPrint = " is a Leap Year.";
            
            if(!isLeapYear(year)){
                leapYearPrint = " is not a Leap Year.";
            }

            System.out.println(year + leapYearPrint);
        }
    }

    private static boolean isLeapYear(int year) {
        if(year%4!=0){
            return false;
        }

        if(year%100==0 && year%400!=0){
            return false;
        }

        return true;
    }
}