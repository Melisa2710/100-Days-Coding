package pkg100days;

import java.math.BigInteger;

public class Day29 {
    public static void main(String[] args) {
      
        BigInteger a,b,c,d,e;
        
        a = new BigInteger("90");
        b = new BigInteger("75");
        c = new BigInteger("80");
        d = new BigInteger("82");
        
        e = a.add(b).add(c).add(d).multiply(d); //a tambah(b) tambah(c) tambah(d) dikali (d)
                
    }
         
}