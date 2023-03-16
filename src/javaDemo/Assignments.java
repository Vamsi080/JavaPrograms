package javaDemo;
public class Assignments{
	public static void main(String[] args) {
		
		InterfaceA value=(n)->{
				if(n%2==0) {
					System.out.println("even");
				}else {
					System.out.println("odd");
				}
		};
		value.valid(69);

	}

}
