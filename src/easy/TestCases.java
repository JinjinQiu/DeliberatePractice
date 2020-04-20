package easy;

import easy.MaxProfit;
import org.junit.Test;

public class TestCases {
	
	@Test
	public void test(){
	int[] a = new int[] { 0, 0, 1, 1, 1, 2, 2, 3, 3, 4 };
	int b = MaxProfit.maxProfit(a);
	System.out.print(b);
	}

}
