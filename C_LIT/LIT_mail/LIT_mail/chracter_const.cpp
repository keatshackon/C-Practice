#include "iostream"
using namespace std;
int bit_count(int);
main()
{1

         int x,n;
        cout<<"Enter a number :";
        cin>>n;
        x=bit_count(n);
        cout<<x;
}
int bit_count(int n)
{
        int c=0;
        while(n>0)
        {
                c++;
                n=n&n-1;
        }
        return c;
}
