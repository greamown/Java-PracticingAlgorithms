/*Write a program that reads an integer between 100 and 999, and show the result of the sum, product and difference of all its digits. 
For example, if an integer is 932, the sum of all its digits is 14, the product of all its digits is 54, and the difference of all its digits is 4.
(The equation of the difference is hundred's digit minus ten's digit minus unit's digits.)
*/

import java.util.Scanner;

class Main {  
  public static void main(String args[]) { 
    Scanner input = new Scanner(System.in);

    System.out.println("please enter a number between 100 and 999");
    int a = input.nextInt();

    int b = a/100;
    int c = (a-100*b)/10;
    int d = a-100*b-10*c;
    int e = b+c+d;
    int f = b*c*d;
    int g = b-c-d;

    System.out.println("The sum is:"+e);
    System.out.println("The product is:"+f);
    System.out.println("The different is:"+g);
  } 
}





// referance source form https://ithelp.ithome.com.tw/articles/10238892
