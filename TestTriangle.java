//Wirakarn Ponpraserd
//6409650311
package question3;
public class TestTriangle {

	public static void main(String[] args) {
		Triangle t1 = new Triangle();
		t1.setSide1(3);
		t1.setSide2(4);
		t1.setSide3(5);
		
		if(t1.getSide1()>0 && t1.getSide1()>0 && t1.getSide3()>0) {
			t1.rightTriangleCheck();
			System.out.printf("\nArea of Triangle with sides (<%.2f>, <%.2f>, <%.2f>) = %.2f"
					,t1.getSide1(),t1.getSide2(),t1.getSide3(),t1.area());
		}
		
	}

}


