class Solution {
    public int maxProfit(int[] prices) {
        Stack<Integer> stack=new Stack<>();
        int diff=0, max=0;
        stack.push(prices[0]);
        for(int i=1;i<prices.length;i++) {
            int num=prices[i];
            if(stack.peek()>num) 
                stack.push(num);
            else {
                diff=num-stack.peek();
                max=Math.max(max,diff);
            }
        }
        return max;
    }
}