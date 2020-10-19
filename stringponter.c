#include<stdio.h>
int main()
{
	char *p="hai-";
	int i;
	for(i=0;i<5;i++){
		p++;
		printf("%d ",p);
	}
//	printf("%c",(p+2));
	return 0;

}
