#include<stdio.h>
int main()
{
	void fun();
	int i=1;
	while(i<=3){
		printf("%d",i);
		if(i>2)
			goto here;
	}
	return 0;
}
void fun()
{
	here:
		printf("keats");
}
