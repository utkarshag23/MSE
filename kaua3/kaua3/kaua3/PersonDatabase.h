//
//  PersonDatabase.h
//  kaua3
//
//  Created by MSE on 27/09/13.
//  Copyright (c) 2013 MSE. All rights reserved.
//

#import <Foundation/Foundation.h>
#import "sqlite3.h"

@interface PersonDatabase : NSObject
{
    sqlite3 *database;
}

+(PersonDatabase *)database;

-(NSArray *)getAllPersons;

@end
