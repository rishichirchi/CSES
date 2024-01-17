#include<iostream>
#include<string>
#include<cmath>
using namespace std;

int main(){
    string s;
    cin>>s;
    long long ans = 0;
    long long count = 0;
    char ch = 'A';
    
    for(char x : s){
        if(x == ch){
            ++count;
            ans = max(count, ans);
        }
        else{
            ch = x;
            count = 1;
        }   
    }

    cout<<ans<<endl;
    return 0;
}