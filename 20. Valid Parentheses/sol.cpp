#include<stack>
#include <iostream>
using namespace std;

class Solution {
public:
    bool isValid(string s) {
        stack<int> char_stack;
        char_stack.push(0);
        int ascii;
        
        for (auto &&i : s)
        {
            ascii=i;
            if (char_stack.top()+1 == ascii || char_stack.top()+2 == ascii)
            {
                char_stack.pop();
            } else {
                char_stack.push(ascii);
            }
        }
        char_stack.pop();
        return char_stack.empty();
    }
};

int main(int argc, char const *argv[])
{
    string str = "()[]{}";
    Solution sol;
    cout<<sol.isValid(str); 
    return 0;
}
