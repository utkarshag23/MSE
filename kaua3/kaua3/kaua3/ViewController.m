//
//  ViewController.m
//  kaua3
//
//  Created by MSE on 26/09/13.
//  Copyright (c) 2013 MSE. All rights reserved.
//

#import "ViewController.h"
#import "PersonDatabase.h"
#import "ViewController2.h"

@interface ViewController ()

@end

@implementation ViewController

- (void)viewDidLoad
{
    [super viewDidLoad];
    NSArray *personInf = [[PersonDatabase database]getAllPersons];
    
    for(ViewController2 *info in personInf)
    {
        NSLog(@"%d, %@, %@",info.uniqueId, info.name, info.address);
    }
	// Do any additional setup after loading the view, typically from a nib.
}

- (void)didReceiveMemoryWarning
{
    [super didReceiveMemoryWarning];
    // Dispose of any resources that can be recreated.
}

@end
