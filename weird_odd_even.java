package weird_odd_even;

import java.util.Scanner;

public class weird_odd_even {
   
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();
    String result = "";
     
    public static void main(String[] args){
        weird_odd_even obj = new weird_odd_even();
        obj.num_input();
}
    
    void num_input() {
        if(num%2==1){
        result = "Weird";
        }
        else if(num%2==0){
            if(2<=num && num<=5){
                result = "Not weird";
            }
            else if(6<=num && num<=20){
                result = "Weird";
            }
            else if(num>20){
                result = "Not weird";
        }
        }
        System.out.println("The number you entered is: " + result);
    }
}