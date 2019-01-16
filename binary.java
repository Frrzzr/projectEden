/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package binary;
import java.util.Scanner;
/**
 *
 * @author kiot
 */
public class Binary {

    static boolean chake_input(char[] str) {
        
        boolean _True = false;
        for (int i = 0; i < str.length; i++) {
            if (str[i] >= 48 && str[i] <= 49) {
                _True = true;
            }
            else {
                _True = false;
                break;
            }
        }
        return _True;
    }    
    
    static String input() {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        return str;
    }
    
    
    static int parse(String str) {
        Double d = Double.parseDouble(str);
        int binary = d.intValue();
        return binary;
    }
    
    
    static int conver_to_decimal(int binary) {
        int result = 0, remainder, i = 0;
        while (binary != 0) {
            remainder = binary%10;
            binary/=10;
            result += remainder*Math.pow(2, i);
            i++;
        }
        
        return result;
    }
    public static void main(String[] args) {
        String str = input();
        if (chake_input(str.toCharArray())) {
            System.out.println("done");
            int bin = parse(str);
            System.out.println(bin);
            int decimal = conver_to_decimal(bin);
            System.out.println(decimal);
        }
        else {
            System.out.println("error");
        }
    }
}

