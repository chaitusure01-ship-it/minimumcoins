class Solution {
    public int minCoins(int n) {
        int[] coins = {10, 5, 2, 1};
        int count = 0;

        for (int i = 0; i < coins.length; i++) {
            if (n >= coins[i]) {
                count = count + n / coins[i];
                n = n % coins[i];
            }
        }
        return count;
    }
}
