"""
12
insert 0 5
insert 1 10
insert 0 6
print
remove 6
append 9
append 1
sort
print
pop
reverse
print
"""

if __name__ == '__main__':
    N = int(input())
    l = []

    for _ in range(N):
        command = input().split()
        parameter = map(int, command[1:])

        if command[0] == "print":
            print(l)
        else:
            getattr(l, command[0])(*parameter)
