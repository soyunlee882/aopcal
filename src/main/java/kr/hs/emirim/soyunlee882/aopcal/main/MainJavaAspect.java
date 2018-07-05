package kr.hs.emirim.soyunlee882.aopcal.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;


import kr.hs.emirim.soyunlee882.aopcal.cal.Calculator;
import kr.hs.emirim.soyunlee882.aopcal.config.JavaConfig;

public class MainJavaAspect {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx =
				new AnnotationConfigApplicationContext(JavaConfig.class);

		Calculator impeCal = ctx.getBean("impCal", Calculator.class);
		long fiveFact1 = impeCal.factorial(5);
		System.out.println("impCal.factorial(5) = " + fiveFact1);
		
		Calculator recCal = ctx.getBean("recCal", Calculator.class);
		long fiveFact2 = recCal.factorial(5);
		System.out.println("recCal.factorial(5) = " + fiveFact2);
	}
}