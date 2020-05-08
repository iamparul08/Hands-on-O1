/* Create a class Box that uses a parameterized constructor to initialize the dimensions of a box.The dimensions of the Box are width, height, depth. The class should have a method that can return the volume of the box. Create an object of the Box class and test the functionalities.*/

class Box {
	double h,w,d;	
	
	public Box(double height, double width, double depth){ //p constructor
	
		h = height;
		w = width;
		d = depth;	
	
	}
	
	double volume() {
		
		double v = h*w*d;
		return v;
		
	}
	
	public static void main(String args[]) {
	
	Box b1 = new Box(20 , 5 , 8);	//object created
		System.out.println("Volume is: "+b1.volume());
		
	}
}