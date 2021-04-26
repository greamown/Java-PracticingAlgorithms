//To find prime number from 1 to 100

class Main {  
  public static void main(String args[]) { 
    	int i,j;
		int k = 100;
		for(i=2;i<=100;i++){
			for(j=2;j<=i;j++){
				if(i%j==0){
					break;
				}
			}
			if(j>=i){
				k++;
				System.out.print(i+"\t");
			}
			if(k>=5){
				System.out.print(i+"\t");
				k=0;
			}
		}
  } 
}