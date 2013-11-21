//
//  ViewController2.h
//  kaua3
//
//  Created by MSE on 26/09/13.
//  Copyright (c) 2013 MSE. All rights reserved.
//

#import <UIKit/UIKit.h>
#import <Foundation/Foundation.h>


@interface ViewController2 : NSObject
{
    NSString* address;
    NSString* name;
    int uniqueId;
}

@property NSString* address;
@property NSString* name;
@property int uniqueId;

-(id) initWithuniqueId:(int)uniqueId_ name:(NSString *)name_ address:(NSString *)address_;

@end
