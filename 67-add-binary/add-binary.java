import java.math.BigInteger;
class Solution {
    public String addBinary(String a, String b) {
        BigInteger numA = new BigInteger(a,2);
        BigInteger numB = new BigInteger(b,2);
        BigInteger sum = numA.add(numB);
        return sum.toString(2); 
    }
}