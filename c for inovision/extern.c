#include<stdio.h>
int main()
{
	extern int num;
	num=90;
	printf("%d", num);
	return 0;
}
int num = 10;

