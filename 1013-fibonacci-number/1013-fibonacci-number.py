class Solution(object):
    def fib(self, n):
        cach = {0:0, 1:1}
        def fibo(n):
            if n in cach:
                return cach[n]
            else:
                cach[n] = fibo(n-2) + fibo(n-1)
                return cach[n]
        return fibo(n)