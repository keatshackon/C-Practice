#include <iostream>
#include <vector>
using namespace std;
int main ()
{
            vector<int> myvector (5);
            int *p = myvector.data();
            *p=10;
            ++p;
            *p=20;
            ++p;
            *p=200;
            ++p;
            *p=400;
            p[4] = 100;
            for (unsigned i = 0; i < myvector.size(); ++i)
                cout << ' ' << myvector[i];

            return 0;

        }

