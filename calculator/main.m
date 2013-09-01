#import<Foundation/Foundation.h>
#import "calch.h" 
#include<stdio.h>

int main(int argc,char *argv[])
{
//int num1,num2;
int res;
calc *cal = [[calc alloc]init];
res = [cal add:10 andArg:10];
printf("Add:%d\n",res);
res = [cal sub:20 andArg:10];
printf("Sub:%d\n",res);
res = [cal div:10 andArg:10];
printf("Div:%d\n",res);
res = [cal mul:15 andArg:10];
printf("Mul:%d\n",res);
/*printf("Enter number1,number2\n");
scanf("%d%d",&num1,&num2);
printf("1.Add 2.Subtract 3.Divide 4.Multiply\n");
scanf("%d",&c);
switch(c)
{
	case 1: res = [cal add:num1 andArg:num2];
				break;
	case 2: res = [cal sub:num1 andArg:num2];
				break;
	case 3: res = [cal div:num1 andArg:num2];
				break;
	case 4: res = [cal mul:num1 andArg:num2];
				break;
				
}
printf("%d",res);*/
[cal release];
return 0;
	
}