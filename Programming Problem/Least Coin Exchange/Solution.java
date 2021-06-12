public class Solution {



    /**
     * Helper method
     * Recursive solution with memoize
     * create array for memoize
     * @param coins
     * @param amount
     * @return
     */
    static int coinExchange(int[] coins, int amount){

        int[] memo = new int[amount+1];
        return exchangeCounter(coins, amount, memo);
    }

    /**
     * recursive method
     * @param coins array of coins
     * @param amount amount 
     * @param memo memoize alr count recursive
     * @return
     */
    static int exchangeCounter(int[] coins, int amount, int[] memo){

        if(memo[amount] != 0){
            return memo[amount];
        }

        else if(amount == 0 ){
            return 0;
        }
        
        else if(amount < 0){
            return -1;
        }
        else {
            int min = Integer.MAX_VALUE;

               

            

        return memo[amount];

        }



    }


    


    public static void main(String[] args) {
        int[] coins = {1,2};
        int amount = 4;

        System.out.println(coinExchange(coins, amount));



    }
    
}
