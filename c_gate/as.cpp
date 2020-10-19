#include<stdio.h>
int foor(int x)
{
	return x*x;
}
int main()
{
	int c=foor(1+2);
	printf("%d",c);
	return 0;
}
