int printf(const char *f, ...);
int main()
{
	int a[]={[1]=20,[3]=100};
	
	printf("%d %d", a[0],a[1]);
	
}
