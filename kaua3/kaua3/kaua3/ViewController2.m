//
//  ViewController2.m
//  kaua3
//
//  Created by MSE on 26/09/13.
//  Copyright (c) 2013 MSE. All rights reserved.
//

#import "ViewController2.h"

@interface ViewController2 ()

@end


@implementation ViewController2
@synthesize name;
@synthesize address;
@synthesize uniqueId;

-(id) initWithuniqueId:(int)uniqueId_ name:(NSString *)name_ address:(NSString *)address_
{
    if(self = [super init])
    {
        self.uniqueId = uniqueId_;
        self.name = name_;
        self.address = address_;
    }
    return self;
}

@end
