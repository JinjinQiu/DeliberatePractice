package easy;
public class MaxProfit {
	
	public static void main(String[] args) {

		int[] a = new int[] { 0, 0, 1, 1, 1, 2, 2, 3, 3, 4 };
		int b = maxProfit(a);
		System.out.print(b);

	}
	
	public static int maxProfit(int[] prices) {
        if(prices.length == 1){
            return 0;
        }
        int result = 0;
        for(int i = 0; i < prices.length-1; i++){
            if(prices[i] < prices[i+1]){
                result+=(prices[i+1] - prices[i]);
            }
                
        }
       return result;     
    }

}
