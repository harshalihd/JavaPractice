package datatypes;

public class DataTypes {
	
	byte by = 127;//primitive datatype.
	short sh = 32767;
	int i = 2147483647;
	long lo= 214748364721474837l;
	
	
	double db = 7890.90;
	float fl = 5766.98f;
	
	char ch = 'R';
	char ch1 = 'a';
	char ch2 = '1';
	char ch3 = '0';
	char ch4 = '%';
	char ch6 = '_';
	char ch7 = '*';
	
	boolean boo1 = true;
	boolean boo2 = false;
	
	String str = "Joe Biden is arriving in Austria tommorrow for NATO Sumit";//string is a class or datatype also to handle the sentences.
	

	
	
	
	public static void main(String[] args) {
		
		
		new DataTypes();
		
		//Non primitive data type
		// Reference variable
		DataTypes calci = new DataTypes ();//object create
		DataTypes calci1 = new DataTypes ();//object create
		DataTypes calci2 = new DataTypes ();//object create

		
		
		
		
		
		calci.Addition();
		System.out.println("The address of variable is " +calci);
		
		calci.Substraction();
		System.out.println("The address of variable is " +calci);
		
	}
	
	
	

	 public void doAddition() {
	   
	   System.out.println("Addition");
	   
   }
   public void doSubstaraction() {
	   
	   
	   
	   
  }

   public void doMultiplication() {
	   
	   
	   
	   
   }
   public void doDivision() {
	   
	   
	   
	   
   }
}
