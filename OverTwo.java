class OverTwo {
	int ovlTwo(int p) {
	 System.out.println("Int p = " + p);
	 return p + p * 1/3;
	}

	float ovlTwo(float q) {
	 System.out.println("Float q = " + q);
	 return q + q * 1/4;
	}

	double ovlTwo(double r) {
	 System.out.println("Double r = " + r);
	return r + r * 1/2;
	}
}

class OverloadTwo {
public static void main(String args[]) {
	OverTwo ob = new OverTwo();
	int resI;
	float resD;
	double resF;

	resI = ob.ovlTwo(30);
	System.out.println("Result of ob.ovlTwo(30): " + resI);
	System.out.println();

	resD = ob.ovlTwo(50);
	System.out.println("Result of ob.ovlTwo(50.00): " + resD);
	System.out.println();

	resF = ob.ovlTwo(70.5);
	System.out.println("Result of ob.ovlTwo(70.5): " + resF);
 }
}