class Rectangle
{
	double l;
	double w;
	public void setValue(double l, double w){
		this.l=l;
		this.w=w;
	}
	public void getArea(){
		System.out.println("ARea of Rectangle is: "+l*w+" Sq. Unit");
	}
	public void getPerimeter(){
		System.out.println("Perimeter of Rectangle is: "+2*(l+w)+" Unit");
	}

}