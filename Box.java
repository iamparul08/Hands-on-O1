

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
