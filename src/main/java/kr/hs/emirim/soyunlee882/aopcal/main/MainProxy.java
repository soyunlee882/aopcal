package kr.hs.emirim.soyunlee882.aopcal.main;

import kr.hs.emirim.soyunlee882.aopcal.cal.ImpeCalculator;
import kr.hs.emirim.soyunlee882.aopcal.cal.RecCalculator;
import kr.hs.emirim.soyunlee882.aopcal.cal.ExeTimeCalculator;

public class MainProxy {

	public static void main(String[] args) {
		int num=20;
		ExeTimeCalculator ttCal1 = new ExeTimeCalculator(new ImpeCalculator());
		System.out.println(ttCal1.factorial(num));

		ExeTimeCalculator ttCal2 = new ExeTimeCalculator(new RecCalculator());
		System.out.println(ttCal2.factorial(num));
	}
}