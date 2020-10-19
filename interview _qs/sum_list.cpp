#include<iostream>
#include<cstring>
#include<algorithm>
struct xxx
{
	int data;
	struct xxx *n;
	
};
struct xxx *createNode()
{
	struct xxx *q,*r,*p;
	p=(struct xxx*)malloc(sizeof(struct xxx));
	printf("enter the data into list==>");
	scanf("%d",&p->data);
	p->n=0;
	r=p;
	char s[4];
	while(1)
	{
		
		printf("\ndo u want ot continue press y or n==>");
		gets(s);

		if(strcmp(s,"no")==0)
			break;
		q=(struct xxx *)malloc(sizeof(struct xxx));
		printf("\nenter the data==>");
		scanf("%d",&p->data);
		p->n=q;
		q->n=0;
		p=q;
	}
	return r;
}
void print(struct xxx *a)
{
	while(a!=0)
	{
		printf("%d",a->data);
	}
}
int main()
{
	
	struct xxx *q,*r,*p;
	p=createNode();
	q=createNode();
	print(p);
	print(q);
	
	
	return 0;
	
}
