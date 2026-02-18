/**
 *Problem Description:
 * Given a positive integer, check whether it has alternating bits:
 * namely, if two adjacent bits will always have different values.
 */


public class BinaryNumberAlternatingBits {

    public boolean hasAlternatingBits(int n) {
        String binaryNumber = Integer.toBinaryString(n);

        for(int i =0;i<binaryNumber.length()-1;i++){
            if(binaryNumber.charAt(i)== binaryNumber.charAt(i+1)){
                return false;
            }
        }
        return true;
    }

}
