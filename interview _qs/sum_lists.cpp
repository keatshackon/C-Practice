#include<iostream>
#include<cstring>
#include<algorithm>
struct xxx
{
	int data;
	struct xxx *n;
	
};
void sum_list(struct xxx *p,struct xxx *q)
{
	int s=0,k=0;
	
	while(p!=0)
	{
		s=s*10+p->data;
		p=p->data;
	}
	while(k!=0)
	{
		k=k*10+q->data;
		q=q->n;
	}
	int a=s+k;
	while(a!=0)
	{
		r=a%10;
		
	}
}
struct xxx *createNode()
{
	struct xxx *q,*r,*p;
	p=(struct xxx*)malloc(sizeof(struct xxx));
	printf("enter the data==>");
	scanf("%d",&p->data);
	
	r=(struct xxx*)malloc(sizeof(struct xxx));
	printf("enter the data==>");
	scanf("%d",&r->data);
	p->n=r;
	q=(struct xxx*)malloc(sizeof(struct xxx));
	printf("enter the data==>");
	scanf("%d",&q->data);
	r->n=q;
	q->n=0;
		
	return p;
}
void print(struct xxx *a)
{
	while(a!=0)
	{
		printf("%d ",a->data);
		a=a->n;
	}
}
int main()
{
	
	struct xxx *q,*r,*p;
	p=createNode();
	printf("\nCreate second linked list:::\n");
	q=createNode();
	printf("\nData of first list:::\n");
	print(p);
	printf("\nData second list=:::\n");
	print(q);
	
	return 0;	
}
