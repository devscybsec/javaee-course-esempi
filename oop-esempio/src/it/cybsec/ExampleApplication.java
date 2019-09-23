package it.cybsec;

import it.cybsec.domain.*;

public class ExampleApplication {

	public static void main(String[] args) {
		A objA = new A(1,2,3);
		B objB = new B(1,2,3);
		A objA_B = new B(1,2,3);
		C objC = new C(1,2,3);
		
//		B objB_A = new A(1,2,3);
		System.out.println(objA.func1());
		System.out.println(objB.func1());
		System.out.println(objA_B.func1());
//		
		System.out.println(objA.attributo1);
		System.out.println(objB.attributo1);
		System.out.println(objC.attributo1);
//		 System.out.println(objA.attributo2);
//		 System.out.println(objA.attributo3);
//		 System.out.println(objB.attributo2);
//		 System.out.println(objC.attributo2);
		
		System.out.println(objA.func1());
		System.out.println(objB.func1());
		System.out.println(objA_B.func1());
//		System.out.println(objA_B.func2());
//		
		System.out.println(objA_B.funcz1());
		
	}

}
