/*
Descrition: The Fibonacci numbers, commonly denoted F(n) form a sequence, called the Fibonacci sequence, 
such that each number is the sum of the two preceding ones, starting from 0 and 1. That is,

F(0) = 0, F(1) = 1
F(n) = F(n - 1) + F(n - 2), for n > 1.
Given n, calculate F(n).
*/
class Solution {
     HashMap<Integer, Integer> memo = new HashMap<Integer, Integer>();
    public int fib(int n) {
        memo.put(0, 0);
        memo.put(1, 1);
        return fibo(n);
    }

    public int fibo(int n){
       if(memo.containsKey(n))
            return memo.get(n);
        else{
            int result = fibo(n - 1) + fibo(n - 2);
            memo.put(n, result);
            return result;
        }
    }
}
