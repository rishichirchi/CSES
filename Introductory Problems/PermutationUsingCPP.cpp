#include <iostream>
using namespace std;

int main(){
    long n;
    cin >> n;

    if(n > 1 && n <=3){
        cout<<"NO SOLUTION";
    }
    else{
        for(long i = 2; i <= n; i+=2){
            printf("%d ", i);
        }
        for(long j = 1; j <= n; j+=2){
            printf("%d ", j);
        }
    }

}