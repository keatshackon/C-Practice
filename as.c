#include<stdio.h>
//int main()
//{
//	int i,j,k,l,h;
//	printf("%c%c%c%c%c%c%c%c%c%c%c%c%c\n",201,205,205,205,205,205,205,205,205,205,205,205,187);
//	printf("%c%c%c%c%c%c%c%c%c%c%c%c%c\n",186,32,32,32,32,32,32,32,32,32,32,32,186);
//	printf("%c%c%c%c%c%c%c%c%c%c%c%c%c\n",186,32,32,32,32,32,32,32,32,32,32,32,186);
//	printf("%c%c%c%c%c%c%c%c%c%c%c%c%c\n",186,32,32,32,32,32,32,32,32,32,32,32,186);
//	printf("%c%c%c%c%c%c%c%c%c%c%c%c%c\n",200,205,205,205,205,205,205,205,205,205,205,205,188);
//
//	return 0;
//	
//}

int main()
{
	int a=201,b=187,c=200,d=188,e=32,f=186;
	int g=205;
	int i,j,k,l,h,q,w;
	
	printf("enter the unit distance for lenght==");
	scanf("%d",&q);
	printf("enter the unit distance for Breadth==");
	scanf("%d",&w);	
	printf("%c",a);
	for(i=0;i<q;i++)
		printf("%c",g);
		printf("%c",b);
		printf("\n");
	for(i=0;i<w;i++)
	{
		printf("%c",f);
		for(j=0;j<q;j++)
		{
			printf("%c",e);
		}
		printf("%c",f);	
		printf("\n");
	}

	
	printf("%c",200);
	for(i=0;i<q;i++)
		printf("%c",g);
	printf("%c",188);
	
		
	//printf("%c%c%c%c%c%c%c",a,b,c,d,e,f,g);
	return 0;
}


















