//package com.tnsif.packs.pack1;
//
//import com.tnsif.packs.pack2.c3;
//import com.tnsif.packs.pack2.c4;
//
//public class executes {
//
//	public static void main(String[] args) {
//
//		// To call all the variables and methods after main method
//		c1 ob = new c1();
//		System.out.println(ob.d);
//		
//		c2 obj = new c2();
//		obj.test1();
//		
//		c3 ob2 = new c3();
//		ob2.test2();
//		
//		c4 ob3 = new c4();
//		ob3.test3();
//		
//	}
//
//}




package com.tnsif.packs.pack1;

import com.tnsif.packs.pack2.c3;
import com.tnsif.packs.pack2.c4;

public class executes {

	public static void main(String[] args) {
		c1 ob = new c1();
		System.out.println(ob.b);
		System.out.println(ob.c);
		System.out.println(ob.d);
		
		//ob.show1();
		ob.show2();
		ob.show3();
		ob.show4();
		c2 ob1 = new c2();
		ob1.test1();
		c3 ob2 = new c3();
		ob2.test2();
		c4 ob3 = new c4();
		ob3.test3();

	}

}