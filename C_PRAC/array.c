int printf(const char *g, ...);
int scanf(const char *g, ...);
int main()
{
	int s[]={1,2,3,4,56};
	printf("%d",sizeof(s)/sizeof(s[0]));



	printf("\n");
	
	int i;
	int *a[5];
	printf("%d\n",sizeof(a));
	for(i=0;i<5;i++)
	{
		scanf("%d",a+i);
	}
	
	for(i=0;i<5;i++)
		printf("%d ",a[i]);
	
	
	printf("%d",sizeof(a));	
	
	
	
	return 0;
}
