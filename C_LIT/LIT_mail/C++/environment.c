#include<stdio.h>
int main()
{
	char *p,*q;
	int a,b,c;
	p=getenv("N1");
	q=getenv("N2");
	a=atoi(p);
	b=atoi(q);
	c=a+b;
	printf("%d",c);
	
	
	return 0;
}
