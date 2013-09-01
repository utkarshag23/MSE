#import<Foundation/Foundation.h>
@interface calc:NSObject          //interface file
{
 int num1;
 int num2;
 
}
-(int)add:(int)n1 andArg:(int)n2;
-(int)sub:(int)n1 andArg:(int)n2;
-(int)div:(int)n1 andArg:(int)n2;
-(int)mul:(int)n1 andArg:(int)n2;

@end