package Day24;

import java.math.BigDecimal;
public class Main {
    
    public static void main(String[] args) {
        
        BigDecimal a,b,c,d,e;
         a = new BigDecimal("1.000");
         b = new BigDecimal("150.000");
         c = new BigDecimal("120.000");
         d = new BigDecimal("111.000");
         
         e = a.add(b).add(c).add(d).subtract(d);// (a) tmbah (b) tambah (c) tambah (d) di kurang (d)
         
        System.out.println(e);
         
    }
    
    
    }
    
