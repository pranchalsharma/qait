
package multiplication_table;

import java.util.*;

public class table {
    
    public static void main(String[] args) {
    
    int a, b;
    
    for (a = 1; a <= 30; a++){
    
        System.out.println("\n\n");
    
        System.out.println("Multiplication table of "+a);
    
    for (b = 1; b <= 10; b++){
        
    System.out.println(a+"*"+b+" = "+(a*b));
    
    }
}
}
}
