#include<stdio.h>
#include<string.h>
int main()
{
	char s[10];
	scanf("%[^\n]s",s);
	printf("%s %d %d",s,sizeof(s),strlen(s));
	
	
	
	
	printf("\n");
	
	
	char *a="damayan";
	
	printf("%s",a);
	printf("%d %d",sizeof(a),strlen(a));
	
	return  0;
}
