
class Calculator {
		
		public static int powerInt(int num1, int num2) {
			
			return ((int)Math.pow(num1, num2));	//avoiding loss of precision (typecast)
			
		}
		
		public static double powerDouble(double num1, int num2) {
			
			return (Math.pow(num1, num2));
			
		}
		
		public static void main(String args[]) {
		
		Calculator c = new Calculator();
		
		System.out.println(c.powerInt(3 , 3));
		
		System.out.println(c.powerDouble(43 , 2));
		
		}
	
}