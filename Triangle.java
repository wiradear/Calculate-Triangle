//Wirakarn Ponpraserd
//6409650311
package question3;
public class Triangle {
	private double  side1,side2,side3;
	private double perimeter,area;
	
	public double  getSide1() {
		return side1;
	}
	
	public double  getSide2() {
		return side2;
	}
	
	public double  getSide3() {
		return side3;
	}
	
	public void setSide1(double  side1) {
		if (side1<=0 || side1%1 != 0) {
			System.out.printf("Please enter the side1 length as 'positive integer'\n");
		}
		else if(side1>0 && side1%1==0) {
				this.side1=side1;	
		}
	}
	
	public void setSide2(double  side2) {
		if (side2<=0 || side2%1 != 0) {
			System.out.printf("Please enter the side2 length as 'positive integer'\n");
		}
		else if(side2>0 && side2%1==0) {
				this.side2=side2;
		}	
	}
	
	public void setSide3(double side3) {
		if (side3<=0 || side3%1 != 0) {
			System.out.printf("Please enter the side3 length as 'positive integer'\n");
		}
		else if(side3>0 && side3%1==0) {
				this.side3=side3;
		}
	}
	
	public void rightTriangleCheck() {
		if((Math.pow(this.side3, 2)== Math.pow(this.side2, 2)+Math.pow(this.side1, 2)) 
				||(Math.pow(this.side2, 2)== Math.pow(this.side3, 2)+Math.pow(this.side1, 2))
				||(Math.pow(this.side1, 2)== Math.pow(this.side2, 2)+Math.pow(this.side3,2))) {
			System.out.printf("This triangle is right-angled triangle!");
		}

		else{
			System.out.printf("This triangle is not right-angled triangle!");
		}
	}
	
	public double area() {
		perimeter = (side1+side2+side3)/2;
		area= Math.sqrt(perimeter*(perimeter-side1)*(perimeter-side2)*(perimeter-side3));
		return area;
	}
}


