#import<Foundation/Foundation.h>
@interface emp:NSObject          //interface file
{
 NSString* name;
 NSString* dept;
 int eid;
 
}
@property (assign) NSString* name;
@property (assign) NSString* dept;
@property int eid;

//-(void) setName: (NSString*)n;
//-(void) setDept: (NSString*)d;
//-(void) setEid: (int) i;
-(NSString*) getName;
-(NSString*) getDept;
-(int) getEid;

@end