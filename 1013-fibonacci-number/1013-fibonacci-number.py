class Solution(object):
    def fib(self, n):
        if n==0:
            return 0
        if n==1:
            return 1
        table = [0,1]

        def fibo(n):
            for i in range(2,n+1):
                f_n = table[i-1] + table[i-2]
                table.append(f_n)
        fibo(n)
        return table[n]

