int main()
{
	int b=90;
	 int *const a=&b;
	*a=19;
	
	printf("%d",*a);
	return 0;
}
