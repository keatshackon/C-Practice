#include<stdio.h>
#include<stdlib.h>
int main()
{
	struct xxx
	{
		char name[40];
		int roll;
	};
	
	typedef struct xxx s;
	s k[3];
	int i,j;
	
	for(i=0;i<3;i++)
	{
		scanf("%s",k[i].name);
		scanf("%d",&k[i].roll);
	}
	
	for(i=0;i<3;i++)
	{
		printf("%d ",k[i].roll);
		printf("%s\n ",k[i].name);
	}
	return 0;
	
	
	
	

}
