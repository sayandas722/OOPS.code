#include <iostream>
#include <string>

using namespace std;
int main()
{
    string sp;
    cout<<"Enter the string:\n";
    cin>>sp;
    int si=0;
    int ei=sp.size()-1;
    while(si<=ei){
        char temp;
        temp=sp[si];
        sp[si]=sp[ei];
        sp[ei]=temp;
        si++;
        ei--;
    }
    cout<<"The string after reversal:\n";
    cout<<sp;
    
}