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

        //check if there's solution inside memo/cache
        if(memo[amount] != 0){
            return memo[amount];
        }
        
        //return 0 if amount = 0
        else if(amount == 0 ){
            return 0;
        }
        
        //return -1 if coins bigger than amount
        else if(amount < 0){
            return -1;
        }
        //counting minimum value
        else {
            int min = Integer.MAX_VALUE;

            //iterate coins
            //count value
            //check if current min < min
            //save into memo

               

            

        return memo[amount];

        }



    }


    


    public static void main(String[] args) {
        int[] coins = {1,2};
        int amount = 4;

        System.out.println(coinExchange(coins, amount));



    }
    
}
