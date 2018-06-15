package kr.hs.emirim.soyunlee882.aopcal.cal;

public class ImpeCalculator implements Calculator {

	@Override
	public long factorial(long num) {
		long start =System.currentTimeMillis();
		long result = 1;
		for (long i = 1; i <= num; i++) {
			result *= i;
		}
		long end =System.currentTimeMillis();
		System.out.printf("Imp factorial(%d); 실헹시간 =%d",num,end-start);
		return result;
	}
}