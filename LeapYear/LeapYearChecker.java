import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.math.BigInteger;
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

            BigInteger year = new BigInteger(strYear);
            if(year.compareTo(BigInteger.ZERO)==-1){
                throw new Exception("Year cannot be negative.");
            }

            String leapYearPrint = " is a Leap Year.";
            
            if(!isLeapYear(year)){
                leapYearPrint = " is not a Leap Year.";
            }

            System.out.println(year + leapYearPrint);
        }
    }

    private static boolean isLeapYear(BigInteger year) {
        if(!year.remainder(new BigInteger("4")).equals(BigInteger.ZERO)){
            return false;
        }

        if(year.remainder(new BigInteger("100")).equals(BigInteger.ZERO) && !year.remainder(new BigInteger("400")).equals(BigInteger.ZERO)){
            return false;
        }

        return true;
    }
}