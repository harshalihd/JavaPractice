package Operators;

public class OperatorsInJava {

	public static void main(String[] args) {
	
		
		//Addition operator in strings
		String s1= "Tell";
		String s2= "Me";
		String s3= "Something";
		String s4= "About";
		String s5= "Yourself";
		String s6= "!";
		
		String s7= s1 +" " + s2 +" "+ s3 +" "+ s4 +" "+ s5+" "+s6+ " "+ " that I know" ;
		
		System.out.println(s7);

		//Addition operator in strings
		
		int n1=20;
		int n2=5;
		
		System.out.println(n1+n2);
		System.out.println(n1-n2);
		System.out.println(n1*n2);
		System.out.println(n1/n2);
		System.out.println(n1%n2);
		
		System.out.println("Adding n1 and n2 -->"+(n1+n2)+" --> will give?");
		
		System.out.println(n1++);
		System.out.println(n1);
		System.out.println(++n1);
		
		System.out.println(n1--);
		System.out.println(n1);
		System.out.println(--n1);
		
		System.out.println(!true);
		System.out.println(!false);
		
		int availablebal=25000;
		int withdrawAmt=26000;
		
		System.out.println(availablebal==withdrawAmt);
		System.out.println(availablebal!=withdrawAmt);
		System.out.println(availablebal > withdrawAmt);
		System.out.println(availablebal < withdrawAmt);
		System.out.println(availablebal >= withdrawAmt);
		System.out.println(availablebal <= withdrawAmt);
		
		int atmcardno=90876;
		int pin=0000;
		
		System.out.println(atmcardno==90876 && pin==0000);
		
		//System.out.println(atmcardno==90876 || pin==0810);
		
		/*if(atmcardno==90876 && pin==0000)
		{
			System.out.println("Withdraw Amount");
			
			/*if(atmcardno==90876 || pin==0000)
			{
				System.out.println("Withdraw Amount");
			}*/
	}
}

