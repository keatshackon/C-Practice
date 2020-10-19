int main()
{
	int a;
	int*c,*d;
	
	c=&a;
	d=c;
	a=a+10;
	print("%d",*c);
	
}
