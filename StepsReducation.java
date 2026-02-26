/**
 * Problem Description:
 * Given the binary representation of an integer as a string s,
 * return the number of steps to reduce it to 1 under the following rules:
 * If the current number is even, you have to divide it by 2.
 * If the current number is odd, you have to add 1 to it.
 * It is guaranteed that you can always reach one for all test cases.
 */





import java.math.BigInteger;

/**
 * Solution-1
 */

class Solution {
    public int numSteps(String s) {
        int count=0;
        int decimal = Integer.parseInt(s,2);


        if(decimal==1){
            return 0;
        }
        while(decimal>1){

            if(decimal%2==0){
                decimal= decimal/2;
                count++;
            }
            else{
                decimal++;
                count++;
            }

        }

        return count;

    }


}






/**
 * Solution-2 based on the constraints
 */

public class StepsReducation {

        public int numSteps(String s) {
            int count=0;
            BigInteger decimal = new BigInteger(s,2);
            BigInteger one = BigInteger.ONE;
            BigInteger two= BigInteger.ONE;


            while(decimal.compareTo(one)>0){

                if(decimal.mod(two).equals(BigInteger.ZERO)){
                    decimal = decimal.divide(two);
                    count++;
                }
                else{
                    decimal= decimal.add(one);
                    count++;
                }

            }

            return count;

        }


    }
class Solution1 {
    public int numSteps(String s) {
        int count=0;
        int carry=0;

        for(int i = s.length()-1;i>0;i--){
            int bit= (s.charAt(i)-'0')+carry;

            if(bit%2==0){
                count++;
            }
            else{
                count++;
                count++;
                carry=1;
            }

        }
        return count+carry;


    }


}





