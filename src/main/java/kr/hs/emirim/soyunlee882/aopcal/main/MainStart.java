package kr.hs.emirim.soyunlee882.aopcal.main;

import kr.hs.emirim.soyunlee882.aopcal.cal.Calculator;
import kr.hs.emirim.soyunlee882.aopcal.cal.ImpeCalculator;
import kr.hs.emirim.soyunlee882.aopcal.cal.RecCalculator;

public class MainStart {
	public void main(String[] args) {
		
		Calculator cal1= new ImpeCalculator();
		long f1= cal1.factorial(4);
		System.out.println("IMP 4: "+f1);
		
		Calculator cal2= new RecCalculator();
		long f2= cal2.factorial(4);
		System.out.println("Rec 4: "+f2);
	}
}
