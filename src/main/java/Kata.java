import java.math.BigInteger;
import java.util.*;
public class Kata
{
    public static long nextBiggerNumber(long n ) {

        final  String convert = String.valueOf(n);
        final StringBuilder result =new StringBuilder();
        for ( int i = convert.length()-1;i>0;i--){
            final int digit = Character.getNumericValue(convert.charAt(i - 1));
            if (digit < Character.getNumericValue(convert.charAt(i))) {
                result.append(convert.substring(0,i-1));
                List<Integer> numbers = new ArrayList<Integer>();
                int smallestLargerDigit = 9;
                int indexOfSmallestLargerDigit = 0;
                for (int j = i; j < convert.length(); j++) {
                    final int actualDigit = Character.getNumericValue(convert.charAt(j));
                    if (actualDigit > digit && actualDigit <= smallestLargerDigit) {
                        smallestLargerDigit = actualDigit;
                        indexOfSmallestLargerDigit = j;
                    }
                }
                result.append(smallestLargerDigit);
                for (int j = i-1 ; j < convert.length(); j++) {
                    if( j != indexOfSmallestLargerDigit) {
                        numbers.add(Character.getNumericValue(convert.charAt(j)));
                    }
                }
                Collections.sort(numbers);
                for (int actualDigit : numbers) {
                    result.append(actualDigit);
                }
                return Long.parseLong(result.toString());
            }
        }
        return -1;
    }
}