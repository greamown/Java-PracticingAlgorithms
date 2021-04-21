/*
Java Calculation concept.
*/

class Main {  
  public static void main(String[] args){
	  int a = 10; //Variable declaration a = 10
	  System.out.println("a = " + a); //print integer(a)
	  int b = a++; //Variable declaration b = a; a = a+1
	  System.out.println("b = a++ : a =" + a + " ,b = " +b); //print integer(a,b)
	  b = ++a;  // b = a+1
	  System.out.println("b = ++a : a =" + a + " ,b = " +b); // print integer (a,b)
	  b = a--; // b = a ; a = a-1
	  System.out.println("b = ++a : a =" + a + " ,b = " +b);   // print integer (a,b)
	  b = --a; //  b = a-1
	  System.out.println("b = ++a : a =" + a + " ,b = " +b);  //print integer(a,b)
	
  }
}