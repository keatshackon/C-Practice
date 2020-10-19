1. The variable created in stack area is called

a)Load Time Variable 
b)Run Time Variable
c)Compile Time Variable
d)None of These

2.The Processor register are also known as 

a)data register
b)code register
c)stack register
d)architecture register

3.Find The Outupt
void main()
{
	int x,y,z;
	x=2,y=4;
	z=y++ * x++ | y--;
	printf("%d",z);
}
a)13
b)28
c)24
d)12

4.Which of the Following is a valid constant ?

a)'5'
b)'\5'
c)'\x5'
d)All of above

5.Find the Outupt
void main()
{
	int x=3;
	if(x>4)
	{
		printf("LIT");
		printf("C Acadamy");
	}
	else
		printf("The Missing Link");
}
a)LITCAcadamy
b)The Missing Link
c)Misplaced else
d)none of These

6.Find The Outupt
void main()
{
	int a=2;	
	pirntf("%d %d %d",a++,++a,a);
}

a)2 3 4
b)3 4 5
c)3 4 4
d)4 3 2

7.The Running program of the computer is called

a)program
b)process
c)software
d)none of These

8.which of the following is a correct declaration
a)int age
b)long age
c)short age
d)all of the above

9.Find The Outupt
void main()
{
	char *p;
	char b[10]={1,2,3,4,5,9,7,8};
	p=(b+1)[5];
	printf("%d",p);
}
a)9
b)7
c)compilation error
d)none of these

10. Find The Outupt
void main()
{
	char *p;
	char c[]="Advance C";
	p=c;
	p="LIT";
	printf("%s",c);
}
a)Advance C
b)LIT
c)compilation error
d)none of these

11.Find The Outupta
void main()
{
	int i=3;
	while(i<5)
	{
		static int j=2;
		printf("%d",j++);
		i++;
	}
}
a)2 2
b)3 2
c)2 3
d)3 3

12.Which modifier almost doubles the largest value of Integer?
a)signed 
b)unsigned
c)short
d)long

13.Find The Outupt
void main()
{
	int x=0;
	int y=4;
	switch(x)
	{
		case 0:
			while(y>0)
			do
			{
				case 1:
					x++;
				case 2:
					++x;
			}while(--y>0);
	}
	printf("%d",x);
}
a)0
b)4
c)8
d)compilation error

14.Find The Outupt
void fun(int *a,int *b)
{
	int *t;
	t=a,a=b,b=a;
	printf("%d %d",*a,*b);
}
void main()
{
	int a=3;
	int b=5;
	fun(&a,&b);
}
a)3 5
b)3 3
c)5 5
d)compilation error

15.Find The Outupt
void main()
{
	char a[][9]={"LIT","Advance","C","Training","Java"};
	printf("%c %s in %s",a[2][0],a[3][0],a[0][0]);
}
a)CT in L
b)C in LIT
c)C Training in LIT
d)compilation error

16.Find The Outupt
void main()
{
	int a=5;
	a=find(a+=find(a++));
}
int find(int a)
{
	return +=a;
}

a)12
b)13
c)15
d)None of these

17.What String does ptr point to in the sample code below?

char *ptr;
char mystring[]="abcdefg";
ptr=mystring;
ptr+=5;

a)fg
b)efg
c)defg
d)cdefg

18.When variable are push into the function frame address of 
variable are
a)Growing up
b)Growing down
c)Growing Left
d)Growing right

19.Find The Outupt
void main()
{
	int x=5,y=6;
	change(&x,&y);
	printf("%d %d",x,y);
}
change(int *x,int *y)
{
	int temp=1;
	temp^=*x;
	*x^=*y;
	*y^=temp;	
}
a)5 6
b)6 5
c)3 2
d)none of these

20.Find The Outupt
void main()
{
	void evaluate(int *x);
	int a[3][3]={{0,1},{2,3},{4,5}};
	evaluate((int *)a);
}
void evaluate(int *e)
{
	printf("%d",*(e+3));
}
a)4
b)2
c)0
d)compilation error

21.The Size of integer variable depends upon 
a)width of address bus
b)width of data bus
c)width of control bus
d)width of system bus

22.Find The Outupt
void main()
{
	char *p="hai";
	char q[]="bye";
	pass(p,q);
	printf("%s %s",p,q);
}
pass(char *p,char q[])
{
	p='H';
	q='B';
}
a)hai bye
b)Hai bye
c)Non portable pointer conversion
d)none of these

23.Find The Outupt
void main()
{
	char *s[]={"LIT","cite","iter"};
	char **p;
	p=s;
	printf("%s",*p);
	printf("%s",++*p);
	printf("%s",++*p);
}
a)LITITT
b)citetee
c)LITITTT
d)itererr

24.Find The Outupt
void main()
{
	int i=4,j=-3;
	mul(&i,j);
	printf("%d %d",i,j);
}
mul(int *a,int *b)
{
	*a=*a * *a;
	b=b*b;
}
a)4 3
b)4 9
c)16 -3
d)none of these

25.Find The Outupt
void main()
{
	int i=1;
	do
	{
		printf("%d",i);
		i++;
	}while(!i==5);
}
a)3
b)2
c)1
d)none of these

26.Find the Outupt
void main()
{
	show();
	show();
}
int show()
{
	static int a=5;
	a++;
	printf("%d",a);	
}
a)5 5
b)6 6
c)5 6
d)6 7

27.#define MIN(a,b) a>b ? b : a
void main()
{
	int a=5,b=6;
	printf("%d",MIN(++a,b));
}
a)5
b)6
c)7
d)none of these

28.Which byte order is followed by motorola Processor
a)little-endian
b)big-endian
c)bi-endian
d)none of these

29.Which operation done by microprocessor for the expression i++
a)read
b)write
c)Both read and write
d)none of these

30.Find The Outupt
void main()
{
	int i=3,j,k;
	j=add(++i);
	k=add(i++);
	printf("%d %d %d",i,j,k);
}
add(int ii)
{
	++ii;
	return(ii);
}
a)5 6 7
b)5 5 5 
c)5 6 6
d)7 7 7

31.Find The Outupt
void main()
{
	char *name="name";
	change(name);
	printf("%s",name);
}
int change(char *name)
{
	char *nm="newname";
	name=nm;
}
a)name
b)amen
c)mena
d)none of these

32.Find The Outupt
int funct1(int a)
{
	if(a)
		return funct1(--a)+a;
	else
		return 0;
}
void main()
{
	int a=7;
	printf("%d",funct1(a));
}
a)19
b)21
c)7
d)20

33.Find The Outupt
void main()
{
	int m=1;
	m=fu(m=fu(m=fu(m)));
	printf("%d",m);
}
int fu(int m)
{
	return ++m;
}
a)10
b)4
c)7
d)none of these

34.Find The Outupt
void main()
{
	char a[]="litindia";
	create(a);
	printf("%s",a);
}
create(char *p)
{
	int i,j=65;
	for(i=0;i<7;i++;j++)
	*(p+i)=i;
}
a)litindia
b)indialit
c)no output,no error
d)none of these

35.Find The output
void main()
{
	char a[]={'ra','ma'};
	int i;
	for(i=0;i<sizeof(a)/sizeof(char);i++)
	printf("%c",a[i]);
}
a)rm
b)rama
c)error,character constant can not be two characters long
d)none of these

36.Find The output
void main()
{
	char a[4]="rama";
	char b[]="shyama";
	printf("%d %d",sizeof(a),sizeof(b));
}
a)4 7
b)5 6
c)5 7
d)4 6

37.Find The output
struct bits
{
	unsigned int a:3;
};
void main()
{
	struct bits b={8};
	printf("%d",b.a);
}
a)8
b)3
c)0
d)none of these

38.The minimum and maximum range of bit-field is 
a)0 to 15
b)1 to 16
c)0 to 31
d)none of these

39.Find The output
void main()
{
	int i=2;
	switch(i>>1)
	{
		default:
			i++;
		case 1:
			;
		case 2:
			;
	}
	printf("%d",i);
}
a)2
b)1
c)compilation error
d)none of these

40.The relational operator ==(equality) always returns
a)0 
b)1
c)0 or 1
d)none of these

41.How many times a for loop will executed in this program?
void main()
{
	char ch;
	for(ch=0;ch<128;ch+4)
		printf("%d",ch);
}
a)127 times 
b)64 times
c)32 times 
d)infinite times

42.What is half of the address 0XFFFFF
a)0X80000
b)0X7FFFF
c)0X00000
d)none of these

43.Find The output
void main()
{
	printf("%d %d",4,5,4);
}
a)4 5
b)0 garbage
c)0 5
d)none of these

44.Find The output
void main()
{
	printf("%%d",5);
}
a)5
b)%d
c)%5
d)none of these

45.Find the output
void main()
{
	char x=-130;
	char y=-5;
	printf("%i",x+y);
}
a)-135
b)-3
c)7
d)121

46.Find The output
void main()
{
	int x,y;
	x=10;
	y=sizeof(++x);
	printf("x=%d y=%d",x,y);
}
a)x=10 y=2
b)x=10 y=4
c)compilation errror
d)none of the above

47.Find the output ? 
void main()
{
    enum color{red, green, blue};
    typedef enum color mycolor;
    mycolor m = red;
    printf("%d", m);
    return 0;
}

a)1
b)2
c)0
d)red

48. Find the output
void main()
{
    typedef int arr[5];
    arr iarr = {1, 2, 3, 4, 5};
    int i;
    for(i=0; i<4; i++)
    {
        printf("%d,", iarr[i]);
    }
    return 0;
}

a)1, 2, 3, 4
b)1, 2, 3, 4, 5
c)compilation error
d)no output

49.Find The output
#define SQR(x)(x*x)
void main()
{
    int a, b=3;
    a = SQR(b+2);
    printf("%d\n", a);
    return 0;
}

a)25
b)11
c)Error
d)Garbage value

50.The maximum combined length of the command-line arguments including the 
spaces between adjacent arguments is

a)128 characters
b)256 characters
c)67 characters
d)It may vary from one operating system to another

51.What will be the output of the program given below if it is executed 
from the command line?
I/N : sample friday tuesday sunday 
void  main(int argc, char *argv[])
{
    printf("%c", **++argv);
    return 0;
}

a)s
b)f
c)sample
d)friday

52.What will the function rewind() do?

a)Reposition the file pointer to a character reverse.
b)Reposition the file pointer stream to end of file.
c)Reposition the file pointer to begining of that line.
d)Reposition the file pointer to begining of file.

53.Find the output
void main()
{
    int i;
    i = printf("How r u\n");
    i = printf("%d\n", i);
    printf("%d\n", i);
    return 0;
}

a)How r u
7
2

b)How r u
8
2

c)How r u
1
1

d)none of these

54.Which header file should be included to use functions like malloc() 
and calloc()?

a)memory.h
b)stdlib.h
c)string.h
d)dos.h

55.Find the output
#include<stdio.h>
#include<stdlib.h>
void main()
{
    int *p;
    p = (int *)malloc(20); /* Assume p has address of 1314 */
    free(p);
    printf("%u", p);
    return 0;
}

a)1314
b)Garbage value
c)1316
d)Random address

56.What would be the equivalent pointer expression for referring the array 
element a[i][j][k][l] ?

a)   ((((a+i)+j)+k)+l)
b)   *(*(*(*(a+i)+j)+k)+l)
c)   (((a+i)+j)+k+l)
d)   ((a+i)+j+k+l)

57.Find the output
void  main()
{
    static char *s[] = {"black", "white", "pink", "violet"};
    char **ptr[] = {s+3, s+2, s+1, s}, ***p;
    p = ptr;
    ++p;
    printf("%s", **p+1);
    return 0;
}
a)ink
b)ack
c)ite
d)let

58.Find the output
int main()
{
    int i=3, *j, k;
    j = &i;
    printf("%d\n", i**j*i+*j);
    return 0;
}

a)30
b)27
c)9
d)3

59.Find the output
void main()
{
    char str[20] = "Hello";
    char *const p=str;
    *p='M';
    printf("%s\n", str);
    return 0;
}

a)Mello
b)Hello
c)HMello
d)MHello

60.How will you print \n on the screen?
a)printf("\n");
b)printf "\\n";
c)printf('\n');
d)printf("\\n");